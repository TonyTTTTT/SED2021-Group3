package p65

import jdk.tools.jlink.resources.plugins;
import p65.Manager;

/**
 * author: fv1230
 */
public class Product {
    private String name;
    private int budget;
    private int interalPriority;
    private Set<Worker> workers;
    private Manager manager;

    public Product(String name, int budget, int interalPriority, Set<Worker> workers, Manager manager) {
        this.name = name;
        this.budget = budget;
        this.interalPriority = interalPriority;
        this.workers = workers;
        this.manager = manager;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }

    public int getInteralPriority() {
        return interalPriority;
    }

    public void setInteralPriority(int interalPriority) {
        this.interalPriority = interalPriority;
    }

    public Set<Worker> getWorkers() {
        return workers;
    }

    public void setWorkers(Set<Worker> workers) {
        this.workers = workers;
    }

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }
}
