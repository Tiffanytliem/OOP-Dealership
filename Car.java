import java.util.Arrays;

public class Car {

    private String make;
    private double price;
    private int year;
    private String color;
    private String[] parts;

    public Car(String make, double price, int year, String color, String[] parts) {
        this.make = make; // the This keyword point to the current object of the constructor
        this.price = price;
        this.year = year;
        this.color = color;
        this.parts = Arrays.copyOf(parts, parts.length); // DONT set arrays equal to each other, to avoid reference
                                                         // trap).
    }

    public Car(Car source) { // this is a copy constructor;
        this.make = source.make;
        this.price = source.price;
        this.year = source.year;
        this.color = source.color;
        this.parts = Arrays.copyOf(source.parts, source.parts.length);
    }

    public String getMake() {
        return make;
    }

    public double getPrice() {
        return price;
    }

    public int getYear() {
        return this.year; // nice to add but dont have to use "this";
    }

    public String getColor() {
        return this.color;
    }

    public String[] getParts() {
        return Arrays.copyOf(this.parts, this.parts.length); // to avoid reference trap
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setParts(String[] parts) {
        this.parts = Arrays.copyOf(parts, parts.length);
    }

    public void drive() {
        System.out.println("You bought the beautiful "
                + this.year + " " + this.color + " " + this.make + " for $" + this.price + ".");
        System.out.println("Please drive your car to the nearest exit.");

    }

    public String toString() {
        return "Make: " + this.make + ".\n" + "Price: " + this.price + ".\n" + "Year: " + this.year + ".\n" + "Color: "
                + this.color + ".\n" + "Parts: " + Arrays.toString(parts) + ".\n";
    }

}// this is a blueprint, which we can use to create objects.
 // object can be called instance.

// To create object,
// 1. Declare the class you're creating an object;
// 2. The variable name;
// 3. The new keyword;
// 4. The class name followed by parenthesis();
// value inside an object start with 0 or null by default;

// Car nissan = new Car();
// **** When write a class that has fields, it needs: 1. Contructor, 2. Getters,
// and 3. Setters;