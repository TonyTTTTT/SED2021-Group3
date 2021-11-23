package TextComposition;

import java.util.Iterator;
import java.util.LinkedHashMap;

public class TexCompositor implements Compositor{
    public void compose(LinkedHashMap<Integer, Component> components){
        Iterator<Component> componentIter = components.values().iterator();
        while (componentIter.hasNext()){
            Component component = componentIter.next();
            System.out.printf("[%d]%s", 
                component.getNaturalSize(),
                component.getContent()
            );
            if (component.getContent().equals("<ParagraphEnd>")){
                System.out.println();
            }
            else if (componentIter.hasNext()){
                System.out.print(" ");
            }
            else if (!componentIter.hasNext()){
                System.out.println();
            }
        }
    }
}
