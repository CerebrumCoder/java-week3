public class Factorial {
    public static void main(String[] args) {
        System.out.println("Faktorial 5 : " + factorial(5));
    }

    public static int factorial(int bil) {
        if (bil <= 0) {
            return 1;
        }
        return bil * factorial(bil - 1);
    }
}
