public class AmbiguousOverloading {
    
    public static void main(String[] args) {
        System.out.println(max(1, 20.0));
    }

    public static double max(int num1, double num2) {
        System.out.println("max(int num1, double num2)");
        if (num1 > num2)
            return num1;
        else
            return num2;
    }

    public static double max(double num1, int num2) {
        System.out.println("max(double num1, int num2)");
        if (num1 > num2)
            return num1;
        else
            return num2;
    }
}
