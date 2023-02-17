package list3;
public class vehicle8 {

}
class Auto extends  vehicle8 {
    boolean sunroof;
}
 class ExtendsVehicleDemo {
    public static void main(String[] args) {
        Auto bmw = new Auto();
        bmw.sunroof = true;

      // System.out.println("Путь, пройденный за 1.5 часа: " + bmw.distance(1.5) + "км.");
     //   System.out.println("Max.скорость: " + bmw.getMaxSpeed() + "км/ч.");
        System.out.println("Наличие люка: " + bmw.sunroof);
    }

}

// я не могу правильно собрать и из за этого не смог сделать 3.20  3.21