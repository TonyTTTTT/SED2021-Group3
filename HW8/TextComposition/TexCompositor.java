package TextComposition;

import java.util.ArrayList;

public class TexCompositor implements Compositor{
    public void compose(ArrayList<Component> components){
        for (Component component : components){
            System.out.printf("[%d]%s", 
                component.getNaturalSize(),
                component.getContent()
            );
            if (component.getContent().equals("<ParagraphEnd>")){
                System.out.println();
            }
            else if (components.indexOf(component) != (components.size() -1)){
                System.out.print(" ");
            }
        }
    }
}
