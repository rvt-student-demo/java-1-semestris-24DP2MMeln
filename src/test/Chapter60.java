package rvt;

public class Chapter60 {
    public static void main(String[] args) {
      
      }
      public static void ex1() {
        int[] val = {0, 1, 2, 3};
        int sum = 0;

        for (int i = 0; i < val.length; i++) {
            sum += val[i];
        }

        System.out.println( "Sum of all numbers = " + sum );
      }
      public static void ex2() {
        int[] val = {13, -4, 82, 17};
        double[] twice = {13.0, -4.0, 82.0, 17.0};

        System.out.println("Original Array: " + val[0] + " " + val[2] + " " + val[3]);

        System.out.println( "New Array: " 
        + twice[0] + " " + twice[1] + " " + twice[2] + " " + twice[3] );
        
      }
      public static void ex3() {
        
      }
      public static void ex4() {

      }
      public static void ex5() {
        int[] val = {0, 1, 2, 3};
        int temp;

        System.out.println("Original Array: "
        + val[0] + " " + val[1] + " " + val[2] + " " + val[3]);

        for (int i = 0; i < val.length / 2; i++) {
          int t = val[i];
          val[i] = val[val.length - 1 - i];
          val[val.length - 1 - i] = t;
        }




        System.out.println("Reversed Array: "
        + val[0] + " " + val[1] + " " + val[2] + " " + val[3]);
      }
}

    
      