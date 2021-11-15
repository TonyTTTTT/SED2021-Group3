package q6;

public class Person {
    private Set<Project> projects;
    private Set<ComputerLanguage> languages;

    public Person(Set<Project> projects, Set<ComputerLanguage> languages) {
        this.projects = projects;
        this.languages = languages;
    }
    
}