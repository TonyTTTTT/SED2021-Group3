package TextComposition;

import java.util.ArrayList;

public class ArrayCompositor implements Compositor{
    public void compose(ArrayList<Component> components){
        int i = 1;
        for (Component component : components){
            System.out.printf("[%d]%s", 
                component.getNaturalSize(),
                component.getContent()
            );
            if ((i++) % 3 == 0){
                System.out.println();
            }
            else if (components.indexOf(component) != (components.size() -1)){
                System.out.print(" ");
            }
        }
    }
}
