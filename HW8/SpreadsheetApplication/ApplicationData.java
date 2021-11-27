package SpreadsheetApplication;

import java.util.ArrayList;
import java.util.LinkedHashMap;

public class ApplicationData {
    
    private ArrayList<Chart> charts = new ArrayList<>();

    private LinkedHashMap<String, Integer> items = new LinkedHashMap<>();

    public void change(String item, int value){
        items.put(item, value);
        for (Chart chart : charts){
            chart.update();
        }
    }

    public void addData(String item, int value){
        items.put(item, value);
    }

    public LinkedHashMap<String, Integer> getData(){
        return items;
    }

    public void attach(Chart chart){
        charts.add(chart);
    }

    public void detach(Chart chart){
        charts.remove(chart);
    }
}
