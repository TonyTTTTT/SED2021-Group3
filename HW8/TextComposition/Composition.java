package TextComposition;

import java.util.LinkedHashMap;

public class Composition {

    private LinkedHashMap<Integer, Component> components = new LinkedHashMap<>();

    private Compositor compositor;

    public void addComponent(Component component){
        components.put(component.getComponentId(), component);
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
