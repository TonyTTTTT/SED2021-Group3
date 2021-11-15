package p65;

public class Worker extends Person{
    
    // private Set<Project> projects;
    private Set<Charge> charges;
    public Worker(
        String name,
        String address, 
        int socialSecurityNumber, 
        Set<Company> companies,  
        Set<Project> projects) {
            super(name, address, socialSecurityNumber, companies);
            // this.projects = projects;
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

    // public Set<Project> getProjects() {
    //     return projects;
    // }
}