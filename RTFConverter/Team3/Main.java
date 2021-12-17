import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(new File(args[0])));

        while (true) {
            try {
                String line = bufferedReader.readLine();
                if (line.equals("TeX")) {
                    String data = bufferedReader.readLine();
                    // TODO: transform data into Tex
                    System.out.println(data);
                } else if (line.equals("TextWidget")) {
                    String data = bufferedReader.readLine();
                    // TODO: transform data into TextWidget
                    System.out.println(data);
                } else
                    System.out.println("Error");
            } catch (Exception e) {
                break;
            }
        }
        bufferedReader.close();
    }
}