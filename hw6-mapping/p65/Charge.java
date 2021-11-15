package p65;

import java.util.Timer;

import p65.Person;

public class Charge {
    private int time;
    private int salary;
    private Person person;
    private Project project;

    public Charge(Timer timer, int salary, Person person, Project project) {
        this.timer = timer;
        this.salary = salary;
        this.person = person;
        this.project = project;
    }

    public int chargeTime(Project project, int time) {
        return salary * time.chargeTime(project, project.getDepartment().getName());
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }
}
