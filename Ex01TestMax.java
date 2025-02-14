

public class Ex01TestMax {
    /** Main method */
    public static void main(String[] args) {
      int i = 5;
      int j = 2;
      int k = max(i, j);
      System.out.println("The maximum between " + i +
        " and " + j + " is " + k);
  
      double i2 = 3;
      double j2 = 7;
      double k2 = max(i2, j2);
      System.out.println("The maximum between " + i2 +
        " and " + j2 + " is " + k2);
    }
  
    public static double max(double num1, double num2){
      double result;
  
      if (num1 > num2)
        result = num1;
      else
        result = num2;
  
      return result;
    }
    
  
    /** Return the max between two numbers */
    public static int max(int num1, int num2) {
      int result;
  
      if (num1 > num2)
        result = num1;
      else
        result = num2;
  
      return result;
    }
  }