public class Person {
    public String firstName;
    public String lastName;
    public int age;

    public Person(String firstName, String lastName, int age)
    {
        if(firstName == "")
            this.firstName = "puste";
        else {
            this.firstName = firstName;
        }
        if(lastName == "")
            this.lastName = "puste";
        else {
            this.lastName = lastName;
        }
        if(age < 0)
            this.age = 0;
        else {
            this.age = age;
        }
    }
    public String toString()
    {
        return ("\"Person: ["
                + firstName
                + "] ["
                + lastName
                + "], Age: ["
                + age
                + "].\"");
    }
    public boolean equals(Person other)
    {
        if(this.firstName.equals(other.firstName) &&
                this.lastName.equals(other.lastName) &&
                this.age == other.age)
            return true;
        return false;
    }
}
