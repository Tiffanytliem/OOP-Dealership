public class Dealership {
    private Car[] cars; // an array of objects

    public Dealership(Car[] cars) {
        this.cars = new Car[cars.length];
        for (int i = 0; i < cars.length; i++) {
            this.cars[i] = new Car(cars[i]); // should not use arrays.copyof to copy an array of objects
        }

    }

    public void setCar(Car car, int index) {
        this.cars[index] = new Car(car); // this calls the constructor where the car is copied from the car source.
    }

    public Car getCar(int index) {
        return new Car(this.cars[index]);
    }

    public void sell(int index) {
        this.cars[index].drive();
        this.cars[index] = null; // remove the car from the dealership.
    }

    public int search(String make, int budget) {
        for (int i = 0; i < this.cars.length; i++) {
            if (this.cars[i] == null) {
                continue; // skip that run in the loop
            } else if (this.cars[i].getMake().equalsIgnoreCase(make) && this.cars[i].getPrice() <= budget) {
                System.out.println(
                        "\nWe found one in spot " + i + "\n" + this.cars[i].toString()
                                + "\nIf you are interested, type 'yes':");
                return i;
            }
        }
        System.out.println("\n Your search didn't match any results.\n");
        return 404;

    }

    public String toString() {
        String temp = "";
        for (int i = 0; i < cars.length; i++) {
            temp += "Parking Spot: " + i + "\n";
            if (this.cars[i] == null) {
                temp += "Empty\n";
            } else {
                temp += this.cars[i].toString() + "\n";
            }
        }
        return temp; // print parking spot and each car parked in it. Can't call anything from a null
    }
}
