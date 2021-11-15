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

    public void addEmployee(Person person) {
        employees.add(person);
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

    /*
    // Redundant code
    */
    // Name getter and setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
