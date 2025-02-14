// an explanation of how it works, looks:
// https://www.geeksforgeeks.org/estimating-value-pi-using-monte-carlo/ 

public class MonteCarloSimulation {
    public static void main(String[] args) {
      final int NUMBER_OF_TRIALS = 10000000;
      int numberOfHits = 0;
  
      for (int i = 0; i < NUMBER_OF_TRIALS; i++) {
        double x = Math.random() * 2.0 - 1; // to generate between -1 and 1
        double y = Math.random() * 2.0 - 1;
        if (x * x + y * y <= 1)
          numberOfHits++;
      }
  
      double pi = 4.0 * numberOfHits / NUMBER_OF_TRIALS;
      System.out.println("PI is " + pi);
    }
  }