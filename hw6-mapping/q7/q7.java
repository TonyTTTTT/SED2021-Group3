public class q7 {
    public static void main(String[] args) {
        InputOutputDevice modem = new Modem();
        InputOutputDevice keyboard = new Keyboard();
        System.out.print("modem output: ");
        modem.output();
        System.out.println("keyboard typing: " + keyboard.input());
    }
}
