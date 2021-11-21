package TextComposition;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Client {
    private static void parseCommand(Composition composition, String[] command){
        String type = command[0];
        // System.out.printf("-- %s\n", type);
        if (type.equals("Text")){
            int componentId = Integer.parseInt(command[1]);
            int naturalSize = Integer.parseInt(command[2]);
            int shrinkability = Integer.parseInt(command[3]);
            int shtrechability = Integer.parseInt(command[4]);
            String content = command[5];
            composition.addComponent(new Text(
                componentId, 
                naturalSize,
                shrinkability,
                shtrechability,
                content
            ));
        }
        else if (type.equals("GraphicalElement")){
            int componentId = Integer.parseInt(command[1]);
            int naturalSize = Integer.parseInt(command[2]);
            int shrinkability = Integer.parseInt(command[3]);
            int shtrechability = Integer.parseInt(command[4]);
            String content = command[5];
            composition.addComponent(new Graphical(
                componentId,
                naturalSize,
                shrinkability,
                shtrechability,
                content
            ));
        }
        else if (type.equals("ChangeSize")){
            int componentId = Integer.parseInt(command[1]);
            int newSize = Integer.parseInt(command[2]);
            composition.getComponents().get(componentId).changeSize(newSize);
        }
        else if (type.equals("Require")){
            String compositor = command[1];
            if (compositor.equals("SimpleComposition")){
                composition.setCompositor(new SimpleCompositor());
            }
            else if (compositor.equals("TexComposition")){
                composition.setCompositor(new TexCompositor());
            }
            else if (compositor.equals("ArrayComposition")){
                composition.setCompositor(new ArrayCompositor());
            }
            composition.arrange();
        }
    }

    public static void main(String[] args){
        args = new String[] {"TextComposition/sampleInput"};
        try{
            for (String filename : args){
                File file = new File(filename);
                Scanner fileReader = new Scanner(file);

                Composition composition = new Composition();

                while (fileReader.hasNextLine()){
                    String strCommand = fileReader.nextLine();
                    String[] command = strCommand.split(" ");
                    parseCommand(composition, command);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("File reading error.");
            e.printStackTrace();
        }
    }
}
