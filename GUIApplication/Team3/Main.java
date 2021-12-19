import java.util.*;
import java.io.*;

public class Main {
    
    private static ArrayList<Window> windows = new ArrayList<Window>();

    private static ArrayList<ScrollBar> scrollbars = new ArrayList<ScrollBar>();

    private static ArrayList<Button> buttons = new ArrayList<Button>();
    
    private static Standard standard = new MotifStandard();
    // private static String style = "Motif";

    public static void main(String[] args) {
        // try {
        parseInputArgs(args);
        // } catch (FileNotFoundException ex) {
        //     System.out.println("Error");
        // }
    }

    public static void switchStyle(Standard inStandard) {

        Main.standard = inStandard;

        for(int i = 0; i < windows.size(); i++) {
            windows.set(i, inStandard.createWindow(windows.get(i).getName()));
        }

        for(int i = 0; i < scrollbars.size(); i++) {
            scrollbars.set(i, inStandard.createScrollbar(scrollbars.get(i).getName()));
        }

        for(int i = 0; i < buttons.size(); i++) {
            buttons.set(i, inStandard.createButton(buttons.get(i).getName()));
        }
    }

    public static void addWindow(String name) {
        String style = Main.getStandardDisplayName();

        if(style.equals("Motif"))
            windows.add(new MotifWindow(name));
        else if (style.equals("PM"))
            windows.add(new PMWindow(name));
    }

    public static void addButton(String name) {
        String style = Main.getStandardDisplayName();

        if (style.equals("Motif"))
            buttons.add(new MotifButton(name));
        else if (style.equals("PM"))
            buttons.add(new PMButton(name));
    }

    public static void addScrollBar(String name) {

        String style = Main.getStandardDisplayName();

        if (style.equals("Motif")){
            scrollbars.add(new MotifScrollBar(name));
        }else if (style.equals("PM")) {
            scrollbars.add(new PMScrollBar(name));
        }
    }

    public static void present() {
        for(Window window: windows) {
            window.display();
        }
        for(ScrollBar scrollbar : scrollbars) {
            scrollbar.display();
        }
        for(Button button : buttons) {
            button.display();
        }
    }

    private static void printError() {
        System.out.printf("Error\n");
    }

    private static Boolean parseInputArgs(String[] args) {
    
        int bookCount = 0;
        int userCount = 0;

        File dataFile = new File(args[0]);
        try {
            BufferedReader reader = new BufferedReader(new FileReader(dataFile));
            try {
                for (String line = reader.readLine(); line != null; line = reader.readLine()) {
//                    System.out.printf("Parsing -- %s\n",line);

                    String[] words = line.split(" ");
                    int wordCount = words.length;

                    if (wordCount == 1) {
                        String command = words[0];
                        if (command.equals("PM")) {
                            //TODO: change style to 'PM'
                            Main.switchStyle(new PMStandard());
                        }
                        else if (command.equals("Motif")) {
                            //TODO: change style to 'Motif'
                            Main.switchStyle(new MotifStandard());
                        }
                        else if (command.equals("Present")) {
                            //TODO: Present
                            Main.present();
                        }
                    }
                    else if (wordCount == 2) {
                        String widget = words[0];
                        String nickname = words[1];

                        if (widget.equals("ScrollBar")) {
                            //TODO: add scrollbar 

                            Main.addScrollBar(nickname);
                        }
                        else if (widget.equals("Window")) {
                            //TODO: add window 
                            Main.addWindow(nickname);
                        }
                        else if (widget.equals("Button")) {
                            //TODO: add button 
                            Main.addButton(nickname);
                        }
                        else {
                            Main.printError();
                        }
                    }
                    else {
                        Main.printError();
                    }

                }
            } catch (IOException ex) {
                System.out.println(ex);
            }
        } catch (FileNotFoundException ex) {

        }
        return true;
    }

    private static String getStandardDisplayName() {
        String sOut = "";

        if (Main.standard instanceof MotifStandard)
            sOut = "Motif"; 
        else if (Main.standard instanceof PMStandard)
            sOut = "PM"; 

        return sOut;
    }
}