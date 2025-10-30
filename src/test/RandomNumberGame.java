package rvt;
import java.util.Random;
import java.util.Scanner;


public class RandomNumberGame {
    public static void main(String[] args) {
       Random result = new Random();
       Scanner scanner = new Scanner(System.in);

       int attempts = 3;
       int computerAnswer = result.nextInt(11);
       System.out.println("I'am thinking of number from 1 to 10. Guess the number! You have 3 attempts.");
       int userAnswer;
       
       while (attempts != 0) {
        userAnswer = scanner.nextInt();

        if (userAnswer != computerAnswer) {
            attempts -= 1;
            System.out.println("Nope! Attempts: " + attempts);
            
        }
        else if(userAnswer == computerAnswer) {
            System.out.println("You won!");
            break;
        }
       }

       if (attempts == 0) {
        System.out.println();
        System.out.println("Correct answer: " + computerAnswer);
        System.out.println("You lost :(");
     }
      }
      
        
      }
     

    
      
     