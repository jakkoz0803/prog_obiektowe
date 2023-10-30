public class Vehicle {
    public String brand;
    public String model;
    public int yearOfProduction;

    public Vehicle(String brand, String model, int yearOfProduction)
    {
        if(brand == "" || brand == "null")
            this.brand = "puste";
        else {
            this.brand = brand;
        }
        if(model == "" || model == "null")
            this.model = "puste";
        else {
            this.model = model;
        }
        if(yearOfProduction > 2023)
            this.yearOfProduction = 2023;
        else {
            this.yearOfProduction = yearOfProduction;
        }
    }
    public String toString()
    {
        return ("\"Vehicle: ["
        + brand
        + "] ["
        + model
        + "], Year: ["
        + yearOfProduction
        + "].\"");
    }
    public boolean equals(Vehicle other)
    {
        if(this.brand.equals(other.brand) &&
                this.model.equals(other.model) &&
                this.yearOfProduction == other.yearOfProduction)
            return true;
        return false;
    }
}
