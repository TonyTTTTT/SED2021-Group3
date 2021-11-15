package q9;

import java.util.HashMap;
import java.util.Set;

/**
 * @author Shine Chang
 */
public class Person {
    private HashMap<Integer, Team> teams = new HashMap<>();

    public Team getTeamByYear(Integer year) {
        return teams.get(year);
    }

    public void playsFor(Integer year, Team team) {
        teams.put(year, team);
    }
}
