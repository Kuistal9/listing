package list3;

public class Vechicle2 {
    int passengers;
    int wheels;

    int maxspeed;
    int burnup;

    Vechicle2(int p, int w, int ms, int bu) {
        passengers = p;
        wheels = w;
        maxspeed = ms;
        burnup = bu; ;
    }


    double distance(double interval) {
        double value = maxspeed * interval;
        return value;

    }

}
class VehicleConstrDemo {
    public static void main(String[] args) {

        Vechicle2 car = new Vechicle2(2, 4, 130, 30);
        Vechicle2 bus = new Vechicle2(45, 4, 120, 25);

        double interval = 1;
        double distanceCar = car.distance(interval);
        double distanceBus = bus.distance(interval);

        System.out.println("авто с пасожирами"+ car.passengers
                + " пассажирами  "+  "проедет за 1 час " );

        System.out.println("Автобус c" + bus.passengers
                +  "пассажирами " +

                "проедет за 1 час "  + distanceBus + "km");
    }

    }
