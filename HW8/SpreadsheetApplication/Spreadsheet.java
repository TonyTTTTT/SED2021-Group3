package SpreadsheetApplication;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class Spreadsheet extends Chart{
    
    public void display(LinkedHashMap<String, Integer> items){
        for (Entry<String, Integer> item : items.entrySet()){
            System.out.printf("%s %d\n", item.getKey(), item.getValue());
        }
    }
}
