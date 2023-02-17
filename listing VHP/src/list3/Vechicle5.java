package list3;

public class Vechicle5 {
    int passengers;
    private int wheels;
    private int maxspeed;
    int burnup;

    Vechicle5(int passengers,  int wheels, int maxspeed, int burnup) {
        this.passengers = passengers;
        this.setWheels(wheels);
        this.maxspeed = maxspeed;
        this.burnup = burnup;
    }
    double distance(double interval) {
        double val = this.maxspeed * interval;
        return val;
    }
    int getMaxspeed() {
        return this.maxspeed;
    }
    int getWheels() {
        return this.wheels;
    }
    void setWheels(int wheels) {
        if ((wheels < 1) || (wheels > 24)) {
            System.out.println("Неверно указано число колес.");
            return;
        }
        this.wheels = wheels;
    }
}
class VehicleGetSetMethod {
    public static void main(String[] args) {
        Vechicle5 ferrari = new Vechicle5(2, -2, 360, 12);
        System.out.println("max скорость: " + ferrari.getMaxspeed() + "км/ч");
        System.out.println("Число колес " + ferrari.getWheels());
        ferrari.setWheels(4);
        System.out.println("Число колес (повторное) : " + ferrari.getWheels());
    }
}
