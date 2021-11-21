package TextComposition;

public class Graphical extends Component{
    public Graphical(int componentId, int naturalSize,
        int shrinkability, int stretchability, String content){
        setComponentId(componentId);
        setNaturalSize(naturalSize);
        setShrinkability(shrinkability);
        setStretchability(stretchability);
        setContent(content);
    }
}
