package TextComposition;

public abstract class Component {

    private int componentId;

    private int naturalSize;

    private int stretchability;

    private int shrinkability;

    private String content;

    public void changeSize(int size){
        if (size < shrinkability || stretchability < size){
            System.out.printf("component %d failed to change size\n", componentId);
        }
        else{
            naturalSize = size;
            System.out.printf("component %d size changed to %d\n", componentId, size);
        }
    }

    public void setComponentId(int id){
        componentId = id;
    }

    public int getComponentId(){
        return componentId;
    }
    
    public void setNaturalSize(int size){
        naturalSize = size;
    }

    public int getNaturalSize(){
        return naturalSize;
    }

    public void setStretchability(int size){
        stretchability = size;
    }

    public int getStretchability(){
        return stretchability;
    }

    public void setShrinkability(int size){
        shrinkability = size;
    }

    public int getShrinkability(){
        return shrinkability;
    }

    public void setContent(String content){
        this.content = content;
    }

    public String getContent(){
        return content;
    }
}
