import java.util.ArrayList;
import java.util.List;

class Citys {
    private List<Route> routes = new ArrayList<>();

    public String cityName;
    public Citys(String cityName){
        this.cityName = cityName;
        this.routes = new ArrayList<Route>();
     }

    public void addRoute(Route route) {
        this.routes.add(route);
    }
}

class Route {
    private List<Citys> cities = new ArrayList<Citys>(); // 2

    public Route(Citys City1, Citys City2){
        this.cities.add(City1);
        this.cities.add(City2);
    }
}
public class Problem10 {
    public static void main(String[] argv){
        Citys cityA = new Citys("cityA");
        Citys cityB = new Citys("cityB");
        Route route1 = new Route (cityA, cityB);
        cityA.addRoute(route1);
    }
}
