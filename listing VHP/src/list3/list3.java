package list3;

public class list3 {
    int passengers;
    int wheels;

    int maxspeed;
    int burnup;
}
class VehicleDemo {
        public static void main(String[] args) {

            list3 car1 = new list3();

        car1.passengers = 2;

        car1.wheels = 6;

        car1.maxspeed = 130;
        car1.burnup = 30;
            double distance = car1.maxspeed * 0.5;
        System.out.print ("3a momyaca carl MoxeT mpoexaTb ");
        System.out.println(distance +  "км");

        car1= null;
    }
}