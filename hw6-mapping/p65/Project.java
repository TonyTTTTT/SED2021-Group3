package p65;

/**
 * author: fv1230
 */
public class Project {
    private String name;
    private int budjet;
    private Set<Person> employees;
    private Department department;
    private Set<Charge> charges;

    public Project(String name, int cost, int weight, Set<Person> employees, Department department, Set<Charge> charges) {
        this.name = name;
        this.cost = cost;
        this.weight = weight;
        this.employees = employees;
        this.department = department;
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

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
