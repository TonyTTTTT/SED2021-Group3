package p65

import p65.Manager;

public class Department {
    private String name;
    private Manager manager;
    private Set<Product> products;

    public Department(String name, Manager manager, Set<Product> products) {
        this.name = name;
        this.manager = manager;
        this.products = products;
    }
    
    // For those Department doesn't have manager.
    public Department(String name, Set<Product> products) {
        this.name = name;
        this.manager = null;
        this.products = products;
    }

    // Redundant code
    public String getName() {
        return name;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    public Manager getManager() {
        return manager;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(Product product) {
        products.remove(product);
    }

    public Set<Product> getProducts() {
        return products;
    }
}
