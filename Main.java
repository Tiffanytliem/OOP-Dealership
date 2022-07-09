import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Car[] cars = new Car[] {
                new Car("Nissan", 5000, 2020, "red", new String[] { "tires", "keys" }),
                new Car("Dodge", 8500, 2019, "blue", new String[] { "tires", "keys" }),
                new Car("Nissan", 5000, 2017, "yellow", new String[] { "tires", "filter" }),
                new Car("Honda", 7000, 2019, "orange", new String[] { "tires", "filter" }),
                new Car("Mercedes", 12000, 2015, "jet black", new String[] { "tires", "filter", "transmission" })
        };

        Dealership dealership = new Dealership(cars);

        /**
         * Task 1 – Add user input.
         * 
         * System.out.println("\n ****** JAVA DEALERSHIP! ****** \n");
         * System.out.print("Welcome! Enter the type of car you're looking for: ");
         * //pick up make
         * System.out.print("Enter your budget: ");
         * //pick up budget
         * 
         */

        System.out.println("\n ****** JAVA DEALERSHIP! ****** \n");
        System.out.print("Welcome! Enter the type of car you're looking for: ");

        String make = scan.nextLine();

        System.out.println("Enter your budget");

        int budget = scan.nextInt();
        scan.nextLine();

        // Task 3 - Call the search action.

        int search = dealership.search(make, budget);

        /*
         * Task 4: case 404
         * println : Feel free to browse through our collection of cars.\n
         * print the dealership.
         */
        if (search == 404) {
            System.out.println("Feel free to browse through our collection of cars. \n");
            System.out.println(dealership);
        }

        /*
         * Task 5 – Selling the car.
         * If it finds a car, pick up the user's decision.
         * If the decision is yes, sell them a car.
         */

        if (search != 404) {
            String decision = scan.nextLine();
            if (decision.equalsIgnoreCase("yes")) {
                dealership.sell(search);
            }
        }

        // Task 6 – Ignore letter cases.

        scan.close();
    }
}

// public class Main {
// public static void main(String[] args) {

// String[] parts = { "tires", "keys" };

// Car[] cars = new Car[] {
// new Car("Nissan", 5000, 2020, "red", new String[] { "tires", "keys" }),
// new Car("Dodge", 11000, 2019, "blue", new String[] { "tires", "keys" }),
// new Car("Nissan", 5000, 2020, "yellow", new String[] { "tires", "keys" })
// };

// Car nissan = new Car("Nissan", 5000, 2020, "red", new String[] { "tires",
// "keys" });

// Car dodge = new Car("Dodge", 11000, 2019, "blue", new String[] { "tires",
// "keys" });

// Car nissan2 = new Car(nissan);

// nissan2.setColor("yellow");

// System.out.println(Arrays.toString(nissan.getParts()));

// nissan.drive();
// dodge.drive();
// nissan2.drive();

// System.out.println(nissan.getColor());

// System.out.println(
// "This " + nissan.getMake() + " is worth $" + nissan.getPrice() + ". It was
// built in " + nissan.getYear()
// + ". It is " + nissan.getColor() + ".\n");

// System.out
// .println("This " + dodge.getMake() + " is worth $" + dodge.getPrice() + ". It
// was built in "
// + dodge.getYear()
// + ". It is " + dodge.getColor() + ".\n");

// Dealership dealership = new Dealership(cars); // create object of the
// dealership class

// for (int i = 0; i < cars.length; i++) {
// dealership.setCar(cars[i], i);
// }

// Car newCar = dealership.getCar(0);
// newCar.setColor("blue");
// System.out.println(newCar);

// dealership.sell(2);

// System.out.println(dealership.search("Dodge", 12000));
