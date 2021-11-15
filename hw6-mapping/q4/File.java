import java.util.List;

public class File {
    private List<Record> records;
    public void addNewRecord(Record inNewRecord) {
        records.add(inNewRecord);
    }
}
