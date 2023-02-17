package list3;

public class Vechicle4 {
    int passengers;
    int wheels;
    int maxspeed;
    int burnup;
    Vechicle4(int passengers, int wheels, int maxspeed, int burnup) {
        this.passengers = passengers;
        this.wheels = wheels;
        this.maxspeed = maxspeed;
        this.burnup = burnup;
    }
    double distance(double interval) {
        double value = this.maxspeed * interval;
        return value;
    }
}
class VehicleAccessDemo{
    public static void main(String[] args) {

        Vechicle4 ferrari = new Vechicle4(2, 4, 360, 12);

        double distance = ferrari.distance(0.5);

        System.out.println("ферари за пол часа проедет "
                + distance + "км.ч");
        System.out.println("скорость "
        + ferrari.maxspeed + "км.ч");
    }

}

