package p65

import jdk.tools.jlink.resources.plugins;
import p65.Department;
import p65.Manager;

/**
 * author: fv1230
 */
public class Product {
    private String name;
    private int cost;
    private int weight;
    private Department department;

    public Product(String name, int cost, int weight, Department department) {
        this.name = name;
        this.cost = cost;
        this.weight = weight;
        this.department = department;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
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
