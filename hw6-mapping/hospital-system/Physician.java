import java.sql.Time;
import java.util.Date;

public class Physician {

    public void admit() {
        Patient newPatient = new Patient(this);
        Hospital.admit(this, newPatient);
        this.treat(newPatient);
    }

    public void treat(Patient inPatient) {
        inPatient.treated();
        Hospital.record(new Date(System.currentTimeMillis()), new Time(System.currentTimeMillis()), new String());
    }
}
