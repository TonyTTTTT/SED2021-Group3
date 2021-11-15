package p65;

/**
 * author: fv1230
 */
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
    
    public Set<Person> getEmployees() {
        return this.employees;
    }

    public void createDepartment(String name, String address, int phoneNumber, Product primaryProduct) {
        Department department = new Department(name, address, phoneNumber, primaryProduct);
        departments.add(department);
        departmentMap.put(name, department);
    }

    public void removeDepartment(Department department) {
        departments.remove(department);
        departmentMap.remove(department.getName());
    }

    public Set<Department> getDepartments() {
        return this.departments;
    }

    public Department getDepartment(String name) {
        return departmentMap.get(name);
    }

    /**
     * REDUNDANT CODE
     */
    public void changePrimaryProduct(Product product) {
        primaryProduct = product;
    }

    public void changeAddress(String address) {
        this.address = address;
    }

    public void changePhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void changeName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public String getAddress() {
        return this.address;
    }

    public int getPhoneNumber() {
        return this.phoneNumber;
    }

    public Product getPrimaryProduct() {
        return this.primaryProduct;
    }
}
