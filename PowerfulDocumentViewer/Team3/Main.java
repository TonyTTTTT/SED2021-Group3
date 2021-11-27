import document.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        File dataFile = new File(args[0]);
        Application application = new Application();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(dataFile));
            try {
                for (String line = reader.readLine(); line != null; line = reader.readLine()) {
                    if (line.equals("Draw")) {
                        application.create(new DrawingDocument());
                    } else if (line.equals("Text")) {
                        application.create(new TextDocument());
                    } else if (line.equals("Present")) {
                        application.present();
                    }
                }
            } catch (IOException ex) {
                System.out.println(ex);
            }
        } catch (FileNotFoundException ex) {
            System.out.println(ex);
        }
    }
}