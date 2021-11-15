import java.sql.Time;
import java.util.Date;

public class Treatment {
    private Date date;
    private Time time;
    private String results;

    Treatment(Physician physician, Patient patient, Date date, Time time, String results) {
        this.date = date;
        this.time = time;
        this.results = results;
    }
}
