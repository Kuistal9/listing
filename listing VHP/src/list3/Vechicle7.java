package list3;

public class Vechicle7 {
    int passengers;
    private int wheels;
    private int maxspeed;
    int burnup;


    Vechicle7(){
        this(4, 4, 160, 13); }

    Vechicle7(int passengers,
              int wheels,
              int maxspeed,
              int burnup){
    this.passengers = passengers;
this.wheels = wheels;
this.maxspeed = maxspeed;
this. burnup = burnup;
}
      double distance(int interval) {
        return distance((double) interval);
    }
    double distance(double interval) {
        double value = this.maxspeed * interval;
        return value;
    }

}
