package p65

import java.util.jar.Attributes.Name;

import jdk.tools.jlink.resources.plugins;
import p65.Manager;

/**
 * author: fv1230
 */
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

    public void createProduct(String name, int cost, int weight) {
        Product product = new Product(name, cost, weight, this);
        products.add(product);
    }

    public void removeProduct(Product product) {
        products.remove(product);
    }

    public Set<Product> getProducts() {
        return products;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    public void setManager(){
        this.manager = null;
    }

    public Manager getManager() {
        return manager;
    }

    /**
     * REDUNDANT CODE
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
