package agents;

import java.util.Date;

public class Nurse {
    private String name;
    private int age;
    private Date dateOfBirth;

    public Nurse() {
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Date getDateOfBirt() {
        return dateOfBirth;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDateOfBirt(Date dateOfBirt) {
        this.dateOfBirth = dateOfBirt;
    }
}