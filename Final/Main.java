import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(new File(args[0])));

        ArrayList<String> inputs = new ArrayList<String>();
        while (true) {
            try {
                String line = bufferedReader.readLine();
                if (line == null)
                    break;
            } catch (Exception e) {
                break;
            }
        }
        bufferedReader.close();
    }
}