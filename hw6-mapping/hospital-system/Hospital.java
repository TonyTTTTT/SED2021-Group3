import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;

public class Hospital {
    static private ArrayList<Physician> registeredPhysicians = new ArrayList<>();
    static private ArrayList<Treatment> records = new ArrayList<>();


    public static void register(Physician inPhysician) {
        registeredPhysicians.add(inPhysician);
    }

    public static void record(Physician physician, Patient patient, Date date, Time time, String result) {
        records.add(new Treatment(physician, patient, date,time,result));
    }
}
