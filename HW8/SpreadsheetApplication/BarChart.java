package SpreadsheetApplication;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class BarChart extends Chart{

    public void display(LinkedHashMap<String, Integer> items){
        for (Entry<String, Integer> item : items.entrySet()){
            for (int i = 0; i < item.getValue(); ++i){
                System.out.print("=");
            }
            System.out.printf(" %s\n", item.getKey());
        }
    }
}
