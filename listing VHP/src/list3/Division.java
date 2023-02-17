package list3;

class Division extends Exception {
    public String getMessage() {
        return "Деление на ноль запрещено!";
    }
}
class ExceptionDemo {
    private static double divide (double dividend, double divisor)
            throws Division {
        if (divisor == 0)
            throw new Division();
        return dividend / divisor;
    }
    public static void main(String[] args) {
        try {
            divide (8,0);
        } catch (Division dz) {
            System.out.println(dz.getMessage());
        }
    }
}
