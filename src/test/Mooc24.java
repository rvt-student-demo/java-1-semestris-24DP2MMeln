package rvt;
import java.util.Scanner;

public class Mooc24 {
    public static void main(String[] args) {
        Mooc24 program = new Mooc24();
        program.divisibleByThree();
      }
      
      public void divisibleByThree() {
        Scanner scanner = new Scanner(System.in);

        int beggining = scanner.nextInt();
        int end = scanner.nextInt();
        while (beggining <= end) {
            if (beggining % 3 == 0) {
                System.out.println(beggining);
            }
            beggining++;
        }
      }
      public static void printStars(int number) {
       
    }
     

    
      
     }