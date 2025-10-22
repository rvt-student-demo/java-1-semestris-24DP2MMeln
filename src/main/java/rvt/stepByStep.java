package rvt;

import java.util.Scanner;

public class stepByStep {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      
      System.out.println("Give numbers: ");
      int number = 0;
      int sum = 0;
      int numberCount = 0;
      float average = 0;
      int oddCount = 0;
      int evenCount = 0;

      while(true) {
        number = scanner.nextInt();
        numberCount += 1;

        if (number == -1) {
            numberCount -= 1;
            break; 
          }
        else if (number % 2 == 0) {
            evenCount += 1;
        }
        else if (number % 2 != 0) {
          oddCount += 1;
        }
          sum += number;
          
        }
      System.out.println("Thx! Bye!");
      System.out.println(sum);
      System.out.println("Numbers: " + numberCount);
      average = sum / numberCount;
      System.out.println("Average: " + average);
      System.out.println("Even: " + evenCount);
      System.out.println("Odd: " + oddCount);
     
     }
}