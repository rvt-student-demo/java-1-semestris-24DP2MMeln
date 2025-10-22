package rvt;

import java.util.Scanner;

public class NumberSumAndNumberCount {
    public static void main(String[] args) {

     Scanner scanner = new Scanner(System.in);

     int numberCount = 0;
     int sum = 0;

     while (true) {
      numberCount++;
      System.out.println("Give a number: ");
      int number = scanner.nextInt();
      sum += number;

      if (number == 0) {
        System.out.println("Number of numbers: " + numberCount);
        System.out.println("Sum of numbers: " + sum);
        break;
      }
     }

     

     


}
}