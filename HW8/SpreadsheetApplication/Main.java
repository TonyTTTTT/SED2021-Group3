package SpreadsheetApplication;

import java.util.HashMap;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Main {

    private static HashMap<String, Chart> charts = new HashMap<>();
    
    private static void parseCommand(ApplicationData data, String[] command){
        String type = command[0];
        // System.out.printf("-- %s\n", type);
        if (type.equals("data")){
            String item = command[1];
            int value = Integer.parseInt(command[2]);
            data.addData(item, value);
        }
        else if (type.equals("addChart")){
            String chartType = command[1];
            Chart chart;
            if (chartType.equals("Spreadsheet")){
                chart = new Spreadsheet();
            }
            else if (chartType.equals("BarChart")){
                chart = new BarChart();
            }
            else{
                chart = new PieChart();
            }
            chart.setData(data);
            data.attach(chart);
            charts.put(chartType, chart);
        }
        else if (type.equals("change")){
            String chartType = command[1];
            String item = command[2];
            int value = Integer.parseInt(command[3]);
            System.out.printf("%s change %s %d.\n", chartType, item, value);
            charts.get(chartType).change(item, value);
        }
    }

    public static void main(String[] args){
        args = new String[] {"SpreadsheetApplication/sampleInput"}; // TO DELETE!!!
        try{
            for (String filename : args){
                File file = new File(filename);
                Scanner fileReader = new Scanner(file);

                ApplicationData data = new ApplicationData();

                while (fileReader.hasNextLine()){
                    String strCommand = fileReader.nextLine();
                    String[] command = strCommand.split(" ");
                    parseCommand(data, command);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("File reading error.");
            e.printStackTrace();
        }
    }
}
