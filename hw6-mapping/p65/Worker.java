package p65;

import java.io.Serial;

/**
 * author: fv1230
 */
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
}