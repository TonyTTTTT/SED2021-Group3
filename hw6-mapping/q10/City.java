package q10;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Shine Chang
 */
public class City {
    private List<Route> routes = new ArrayList<>();

    public boolean addRoute(Route route) {
        if (routes.contains(route) == false){
            routes.add(route);
            return true;
        }
        return false;
    }

    public boolean isConnected(City destination) {
        for (Route route : routes) {
            if (route.contains(destination)) {
                return true;
            }
        }
        return false;
    }
}
