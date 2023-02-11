package org.list3.example;

public class list3x3 {
    int passengers;
}
class RefTypes {
    public static void main(String[] args) {
        list3x3 car1,car2 = new list3x3();

        car1 = new list3x3();
        car1.passengers =25;
        System.out.println("Количество пассажиров саг2 равно " + car2.passengers);
        car2.passengers = 50;
        System.out.println("Количество пассажиров car1 равно " + car1.passengers);
    }
}
