package document;

public class TextDocument extends Document {
  public void present() {
    System.out.println(this.getClass().getSimpleName());
  }

}