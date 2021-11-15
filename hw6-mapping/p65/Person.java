package p65;

import java.util.Timer;

public abstract class Person {
    private String name;
    private String address;
    private int socialSecurityNumber;
    private Set<Company> companies;

    public Person(String name, String address, int socialSecurityNumber, Set<Company> companies) {
        this.name = name;
        this.address = address;
        this.socialSecurityNumber = socialSecurityNumber;
        this.companies = companies;
    }

    public abstract int chargeTime(Project project, Timer time);

    // Name getter and setter
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Address getter and setter
    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    // Social security number getter
    public int getSocialSecurityNumber() {
        return this.socialSecurityNumber;
    }
    
    // Company getter and setter
    public Set<Company> getCompanies() {
        return this.companies;
    }

    public void setCompanies(Set<Company> companies) {
        this.companies = companies;
    }
}