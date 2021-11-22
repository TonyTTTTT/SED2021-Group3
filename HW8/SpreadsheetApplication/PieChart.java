package SpreadsheetApplication;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class PieChart extends Chart{

    private int itemValueSum;

    public void sumUpItemValue(LinkedHashMap<String, Integer> items){
        itemValueSum = 0;
        for (int value : items.values()){
            itemValueSum += value;
        }
    }

    public void update(){
        LinkedHashMap<String, Integer> items = data.getData();
        sumUpItemValue(items);
        display(items);
    }
    
    public void display(LinkedHashMap<String, Integer> items){
        for (Entry<String, Integer> item : items.entrySet()){
            float percentage = 100 * (float)item.getValue() / itemValueSum;
            System.out.printf("%s %.1f%%\n", item.getKey(), percentage);
        }
    }
}
