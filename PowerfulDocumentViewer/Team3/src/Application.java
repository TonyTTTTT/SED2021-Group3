import document.*;
import java.util.ArrayList;

public class Application{
    private ArrayList<Document> documents =  new ArrayList<Document>();

    public void create(Document document){
        documents.add(document);
    }
    public void present(){
        for(Document document: documents){
            document.present();
        }
    }
}