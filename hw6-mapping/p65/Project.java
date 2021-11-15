package p65;

/**
 * author: fv1230
 */
public class Project {
    private String name;
    private int budjet;
    private Set<Person> employees;
    private Set<Salary> salaries;
    private Set<Worker> workers;
    private Set<Manager> managers;

    public Project(String name, int budjet, Set<Person> employees, Department department, Set<Charge> charges) {
        this.name = name;
        this.cost = budjet;
        this.employees = employees;
        this.department = department;
    }

    public void addWorker(Worker worker) {
        this.workers.add(worker);
    }

    public void removeWorker(Worker worker) {
        this.workers.remove(worker);
    }

    public void addManager(Manager manager) {
        this.managers.add(manager);
    }

    public void removeManager(Manager manager) {
        this.managers.remove(manager);
    }
    
    public void addEmployee(Person person) {
        employees.add(person);
    }

    public Set<Person> getEmployees() {
        return employees;
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
}
