package list3;

public class Vechicle3 {
    int passengers;
    int wheels;

    int maxspeed;

    int burnup;
    Vechicle3(int passengers, int wheels, int maxspeed,
            int burnup) {

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
