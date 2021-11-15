package q10;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Shine Chang
 */
public class Route {
    private List<City> cities = new ArrayList<>();

    public void addCity(City city) {
        cities.add(city);
        city.addRoute(this);
    }

    public boolean contains(City city) {
        return cities.contains(city);
    }
}
