import java.util.ArrayList;

public abstract class DataView {
    private ArrayList<Element> elements = new ArrayList<Element>();

    public abstract void display();

    public abstract void addElement(String type);

    public ArrayList<Element> getElements() {
        return elements;
    }
}
