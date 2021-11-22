package TextComposition;

import java.util.ArrayList;

public class Composition {

    private ArrayList<Component> components = new ArrayList();

    private Compositor compositor;

    public void addComponent(Component component){
        components.add(component);
    }

    public Component getComponent(int componentId){
        return components.get(componentId);
    }

    public void setCompositor(Compositor compositor){
        this.compositor = compositor;
    }

    public void arrange(){
        compositor.compose(components);
    }
}
