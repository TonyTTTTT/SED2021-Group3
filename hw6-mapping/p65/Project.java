package p65;

/**
 * author: fv1230
 */
public class Project {
    private String name;
    private int budjet;
    private int priority;

    // private Set<Person> employees;
    private Set<Salary> salaries;
    private Set<Worker> workers;
    private Manager manager;

    public Project(String name, int budjet, Department department, Set<Salary> salaries, Set<Worker> workers, Manager manager) {
        this.name = name;
        this.cost = budjet;
        this.department = department;
        this.salaries = salaries;
        this.workers = workers;
        this.manager = manager;
    }

    public void addWorker(Worker worker) {
        this.workers.add(worker);
    }

    public void removeWorker(Worker worker) {
        this.workers.remove(worker);
    }

    public void changeManager(Manager manager) {
        this.managers = manager;
    }

    public void createSalary(int time, int salary, Person person, Project project) {
        Salary s = new Salary(time, salary, person, project);
        salaries.add(s);
        person.addSalary(s);
    }

    public void removeSalary(Salary salary, Person person) {
        salaries.remove(salary);
        person.removeSalary(salary);
    }


    /**
     * REDUNDANT CODE
     */
    // Name getter and setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBudjet() {
        return cost;
    }

    public void setBudjet(int budjet) {
        this.budjet = budjet;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }
}
