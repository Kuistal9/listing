package list2;

public class Scope {
    public static void main(String[] args) {
        int x; // переменная х видна во всем методе main()
        x = 1;
        System.out.println("до вложенного блока: х равно " + x);
        {
            int y = 3;


            System.out.println("Внутренний блок: х равно" + x + ", y равно " + y);
            x = y * 3;
        }
        System.out.println("После вложенного блока: x равно" + x);
    }
}
