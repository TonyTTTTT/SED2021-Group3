public class q8 {
    public static void main(String[] args) {
        Object object = new Object();
        System.out.println(object.attributes);
        object.attributes.add(new Attribute("attr1"));
        object.attributes.add(new Attribute("attr2"));
        System.out.println(object.attributes);
    }
}
