package p65

/**
 * author: fv1230
 */
import jdk.tools.jlink.resources.plugins;
import p65.Person;

public class Manager extends Person {
    
    private String department;
    private Set<Project> projects;
    public Manager(
        String name,
        String address, 
        int socialSecurityNumber, 
        Set<Company> companies, 
        String department, 
        Set<Project> projects) {
            super(name, address, socialSecurityNumber, companies);
            this.department = department;
            this.projects = projects;
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

    // Project operations
    public Set<Project> getProjects() {
        return this.projects;
    }

    public void addProject(Project project) {
        this.projects.add(project);
    }

    public void removeProject(Project project) {
        this.projects.remove(project);
    }
}
