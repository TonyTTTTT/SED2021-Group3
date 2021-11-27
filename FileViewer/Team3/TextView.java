public class TextView extends DataView{

    public String name;

    public TextView(String name) {
        this.name = name;
    }

    public void display(){
        System.out.printf("%s", name);
        for (Element element : getElements()){
            System.out.printf(" %s", element.getName());
        }
        System.out.println();
    }

    public void addElement(String type){
        if (type.equals("thickBlackBorder")){
            Border border = new Border();
            border.setName("thickBlackBorder");
            getElements().add(border);
        }
        else if (type.equals("scrollBar")){
            Scrollbar scrollbar = new Scrollbar();
            scrollbar.setName("scrollBar");
            getElements().add(scrollbar);
        }
    }
}