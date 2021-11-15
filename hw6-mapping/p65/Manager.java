package p65

import jdk.tools.jlink.resources.plugins;
import p65.Person;

public class Manager extends Person {
    
    private String department;
    // private Set<Project> projects;
    private Set<Charge> charges;
    public Manager(
        String name,
        String address, 
        int socialSecurityNumber, 
        Set<Company> companies, 
        String department, 
        Set<Project> projects) {
            super(name, address, socialSecurityNumber, companies);
            this.department = department;
            // this.projects = projects;
    }

    // Department operations
    public String getDepartment() {
        return this.department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void removeDepartment(Department department) {
        this.department = null;
    }

    // Charge operations getter and setter
    public Set<Charge> getCharges() {
        return charges;
    }

    public void setCharges(Set<Charge> charges) {
        this.charges = charges;
    }

    public int chargeTime(Project project, Timer time) {
        int charge = 0;
        for (Charge c : charges) {
            if (c.getProject().equals(project)) {
                charge += c.getCharge(time);
            }
        }
        return charge;
    }

    // // Project operations
    // public Set<Project> getProjects() {
    //     return this.projects;
    // }

    // public void addProject(Project project) {
    //     this.projects.add(project);
    // }

    // public void removeProject(Project project) {
    //     this.projects.remove(project);
    // }
}
