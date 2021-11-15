package p65;

public class Worker extends Person{
    
    private Set<Project> projects;
    public Worker(
        String name,
        String address, 
        int socialSecurityNumber, 
        Set<Company> companies,  
        Set<Project> projects) {
            super(name, address, socialSecurityNumber, companies);
            this.projects = projects;
    }

    // Project operations getter and setter
    public Set<Project> getProjects() {
        return projects;
    }
}