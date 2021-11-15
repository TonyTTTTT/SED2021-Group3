package q6;
import java.util.Set;

public class Person {
    private Set<Project> project;
    private ProgrammingLanguage language;

    public write(Project new_project) {
        new_project.addCodeWritter(this);
        project.add(new_project);
    }
}