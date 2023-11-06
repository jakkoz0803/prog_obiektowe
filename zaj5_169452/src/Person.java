public class Person {
    private String firstName;
    protected String lastName;
    public Person() {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public String getFirstName() {
        return firstName;
    }
    protected String getLastName() {
        return lastName;
    }
}

class Employee extends Person {
    public String DisplayData() {
        return getFirstName() + " " + getLastName();
    }
}