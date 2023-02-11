package org.list3.example;

public class vehicle {
    int passengers;
    int wheels;
    int maxspeed;
    int burnup;
    void distance(double interval)
    {
double value = maxspeed * interval;
System.out.println("пройдиный путь равный " + value + "km" );
    }
}
class VehicleMethodDemo {
    public static void main(String[] args) {
        vehicle car = new vehicle();
        car.passengers = 2;
        car.wheels =4;
        car.maxspeed = 130;
        car.burnup = 30;
        vehicle bus = new vehicle();
        bus.passengers = 45;
        bus.wheels =4;
        bus.maxspeed = 100;
        bus.burnup = 25;
                double time = 0.5;
    System.out.println( "машина с" + car.passengers + "пассажиры");
    car.distance(time);
    System.out.println("автобус с" + bus.passengers + "пассажиры");
        bus.distance(time);

    }
}