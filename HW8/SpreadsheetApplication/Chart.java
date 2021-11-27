package SpreadsheetApplication;

import java.util.LinkedHashMap;

public abstract class Chart {

    ApplicationData data;

    public void update(){
        LinkedHashMap<String, Integer> items = data.getData();
        display(items);
    }

    public void change(String item, int value){
        data.change(item, value);
    }

    public abstract void display(LinkedHashMap<String, Integer> items);

    public void setData(ApplicationData data){
        this.data = data;
    }
}
