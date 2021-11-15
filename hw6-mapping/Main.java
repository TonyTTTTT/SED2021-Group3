import q10.*;

/**
 * @author Shine Chang
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("\n=========================");
        System.out.println("Start testing Question 10");
        if (testQ10() == true) {
            System.out.println("Question 10 succeed");
        } else {
            System.out.println("Question 10 failed!!");
        }

        System.out.println("=========================");
    }

    public static boolean testQ10() {
        City c1 = new City();
        City c2 = new City();
        Route r = new Route();
        r.addCity(c1);
        r.addCity(c2);
        return c1.isConnected(c2) == true;
    }
}
