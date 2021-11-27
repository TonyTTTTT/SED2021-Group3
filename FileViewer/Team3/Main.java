import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) {
        try {
            for(String filename: args) {
                File file = new File(filename);
                Scanner fileReader = new Scanner(file);

                LinkedHashMap<String, DataView> dataView = new LinkedHashMap<String, DataView>();

                while(fileReader.hasNextLine()) {
                    // System.out.println(fileReader.nextLine());
                    String[] line = fileReader.nextLine().split(" ");
                    if(line[1].equals("add")) {
                        String[] subLine = Arrays.copyOfRange(line, 2, line.length);
                        for (String sub : subLine) {
                            dataView.get(line[0]).addElement(sub);
                        }
                    }
                    else if(line[1].equals("display")) {
                        dataView.get(line[0]).display();
                    }
                    else {
                        dataView.put(line[0], new TextView(line[1]));
                    }
                }
            }
        } catch (FileNotFoundException ex) {
            System.out.println("error");
        }
    }
}