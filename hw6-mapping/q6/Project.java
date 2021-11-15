package q6;
import java.util.Set;

public class Project {
    private Set<Person> programmer;
    private Set<ProgrammingLanguage> language;

    public addProgrammer(Person p) {
        programmer.add(p);
    }

    public addLanguage(ProgrammingLanguage new_language) {
        language.add(new_language);
    }
}