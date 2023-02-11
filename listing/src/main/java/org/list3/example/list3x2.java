package org.list3.example;

public class list3x2 {
    int passengers;
    int wheels;
    int maxspeed;
    int burnup;
}
class MoreVehiclesDemo {
    public static void main(String[] args) {
// объект carl
        list3x2 car1 = new list3x2();
        car1.passengers = 2;
        car1.wheels = 6;
        car1.maxspeed = 130;
        car1.burnup = 30;
// другой экземпляр класса Vehicle: объект busl
        list3x2 bus1 = new list3x2();
        bus1.passengers = 45;
        bus1.wheels = 4;
        bus1.maxspeed = 100;
        bus1.burnup = 45;
// расчет пути, пройденного за 1.25 часа
        double interval = 1.25;
        double distanceCar = car1.maxspeed * interval;
        double distanceBus = bus1.maxspeed * interval;
        System.out.print("carl может проехать за 1 час 15 мин. расстояние в" );
                System.out.print(distanceCar + " км с " +
                        car1.passengers );
 System.out.println(" пассажирами " );
  System.out.print("busl может проехать за 1 час 15 мин. расстояние в" );
  System.out.print(distanceBus + " км с " + bus1.passengers );
System.out.println(" пассажирами.*");
    }
}
