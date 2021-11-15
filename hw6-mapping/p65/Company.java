package p65;

public class Company {
    private String name;
    private String address;
    private int phoneNumber;
    private Product primaryProduct;
    private Set<Person> employees;
    private Set<Department> departments;
    private Hashtable<String, Department> departmentMap;
    

    public Company(String name, String address, int phoneNumber, Product primaryProduct, Set<Person> employees) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.primaryProduct = primaryProduct;
        this.employees = employees;
    }

    public void hire(Person person) {
        employees.add(person);
    }

    public void fire(Person person) {
        employees.remove(person);
    }

    public void addDepartment(Department department) {
        departments.add(department);
        departmentMap.put(department.getName(), department);
    }

    public void removeDepartment(Department department) {
        departments.remove(department);
        departmentMap.remove(department.getName());
    }

    public Department getDepartment(String name) {
        return departmentMap.get(name);
    }

    // Redundant code
    public void setPrimaryProduct(Product product) {
        primaryProduct = product;
    }

    public void changeAddress(String address) {
        this.address = address;
    }

    public void changePhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

}
