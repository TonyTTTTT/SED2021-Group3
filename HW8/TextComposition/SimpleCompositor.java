package TextComposition;

import java.util.LinkedHashMap;

public class SimpleCompositor implements Compositor{
    public void compose(LinkedHashMap<Integer, Component> components){
        for (Component component : components.values()){
            System.out.printf("[%d]%s\n", 
                component.getNaturalSize(),
                component.getContent()
            );
        }
    }
}
