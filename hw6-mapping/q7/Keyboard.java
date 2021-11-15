public class Keyboard extends InputOutputDevice{
    private String data = "Typing on keyboard...";
    @Override
    public String input() {
        return this.data;
    }
}
