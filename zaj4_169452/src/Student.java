public class Student {
    private String firstName;
    private String lastName;
    private int indexNumber;
    private int yearOfStudy;
    private double gradeAverage;

    public String getFirstName {
        return firstName;
    }
    public String getLastName {
        return lastName;
    }
    public int getIndexNumber {
        return indexNumber;
    }
    public int getYearOfStudy {
        return yearOfStudy;
    }
    public double getGradeAverage {
        return gradeAverage;
    }

    public Student(String firstName, String lastName, int indexNumber, int yearOfStudy, double gradeAverage) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.indexNumber = indexNumber;
        this.yearOfStudy = yearOfStudy;
        this.gradeAverage = gradeAverage;
    }

    public void showInformation()
    {
        return ("imie i nazwisko: "
        + firstName + " " + lastName
        + ", nr indeksu: "
        + indexNumber
        + ", rok studiow: "
        + yearOfStudy
        + ", srednia: "
        + gradeAverage);
    }
}
