package document;

public class DrawingDocument extends Document {
  public void present() {
    System.out.println(this.getClass().getSimpleName());
  }
}