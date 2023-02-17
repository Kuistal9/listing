package list3;

public class Vechicle {
    int passengers;
    int wheels;
    int maxspeed;
    int burnup;
    double distance(double interval)
    { double value = maxspeed * interval; return value;}

}
class VehicleRetMethod {
    public static void main(String[] args) {


    Vechicle car = new Vechicle ();
    car.passengers = 2;
    car.wheels = 4;
    car.maxspeed = 130;
    car.burnup = 30;
    // другой экземпляр класса Vehicle
        Vechicle bus = new Vechicle();
    bus.passengers = 45;
    bus.wheels = 4;
    bus.maxspeed = 100;
    bus.burnup = 25;
    double time = 0.5;
    double distanceCar = car.distance(time);
    double distanceBus = bus.distance(time);
System.out.print("автомобиль c " + car.passengers + " пассажирами ");
        System.out.println("пройдет за полчаса путь " + distanceCar + " км.");
            System.out.print("автобус c " + bus.passengers +
            " пассажирами ");
            System.out.println("пройдет за полчаса путь " + distanceBus + " км.");
} // main(String[))
} // VehicleRetMethod class

