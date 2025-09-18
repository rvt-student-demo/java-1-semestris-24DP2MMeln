package rvt;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

      Scanner scanner = new Scanner(System.in);

      System.out.println("Enter any number");
      int number = scanner.nextInt();

      if (number > 0) {
        System.out.println("Number is positive: " + number);
      }
      else if (number == 0) {
        System.out.println("The number is zero!");
      }
      else {
        System.out.println("The number is negative: " + number);
      }


     
    
}
}
