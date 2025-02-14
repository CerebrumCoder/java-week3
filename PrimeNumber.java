public class PrimeNumber {
    
    public static void main(String[] args) {
        final int NUMBER_OF_PRIMES = 50;
        final int NUMBER_OF_PRIMES_PER_LINE = 10;
        int count = 0;
        int number = 2;

        System.out.println("The first 50 prime numbers are \n");

        while (count < NUMBER_OF_PRIMES) {
            boolean isPrime = true;

            int divisor = 2;
            while (isPrime && divisor <= number / 2) {
                if (number % divisor == 0) {
                    isPrime = false;
                }
                divisor++;
            }

            if (isPrime) {
                count++;
                System.out.printf("%4d", number);
                if (count % NUMBER_OF_PRIMES_PER_LINE == 0) {
                    System.out.println("");
                }
            }

            number++;
        }
    }

}
