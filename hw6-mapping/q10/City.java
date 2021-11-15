package q10;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Shine Chang
 */
public class City {
    private List<City> routes = new ArrayList<>();

    public boolean addRoute(City destination) {
        if (!routes.contains(destination)) {
            return (routes.add(destination) && destination.addRoute(this));
        }
        return false;
    }

    public boolean isConnected(City destination) {
        return routes.contains(destination);
    }
}
