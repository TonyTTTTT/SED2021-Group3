package q6;

import java.time.Period;

import q6.Person;

public class Project {
    private Set<Person> persons;
    private Set<ComputerLanguage> languages;

    public Project(Set<Person> persons, Set<ComputerLanguage> languages) {
        this.persons = persons;
        this.languages = languages;
    }
}
