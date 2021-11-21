package TextComposition;

public class Text extends Component{
    public Text(int componentId, int naturalSize,
        int shrinkability, int stretchability, String content){
        setComponentId(componentId);
        setNaturalSize(naturalSize);
        setShrinkability(shrinkability);
        setStretchability(stretchability);
        setContent(content);
    }
}
