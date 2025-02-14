import java.util.Scanner;

public class GreatestCommonDivisor {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int n1 = input.nextInt();
        System.out.print("Enter second integer: ");
        int n2 = input.nextInt();

        int bil;
        if (n1 < n2) {
            bil = n1;
        } else {
            bil = n2;
        }

        while (!(n1 % bil == 0 && n2 % bil == 0)) {
            bil = bil - 1;
        }


        int jawaban = 1;
        int k = 2;
        while (k <= n1 && k <= n2) {
            if (n1 % k == 0 && n2 % k == 0) 
                jawaban = k;
            k = k + 1;
        }

        System.out.println("The greatest common divisor for " + n1 + " and " + n2 + " is " + jawaban);
    }
    
}




