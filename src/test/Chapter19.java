package rvt;

import java.util.Scanner;

public class Chapter19 {
    public static void main(String[] args) {

        

     
      }
     
     public static void ex1() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter start: ");
        int start = scanner.nextInt();

        System.out.println("Enter End: ");
        int end = scanner.nextInt();

        

        System.out.println();

        while (start <= end) { 
            start += 1;
            System.out.println(start - 1);
        }
     }

     public static void ex2() {
     
     }

     public static void ex3() {
     
     }

     public static void ex4() {
     
     }

     public static void ex5() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter word: ");
        String word = scanner.nextLine();

        System.out.println();

        for (int i = 0; i <= word.length() - 1; i++) {
            System.out.println(word);
        }

     }

     public static void ex6() {
     Scanner scanner = new Scanner(System.in);

     System.out.println("Enter first word: ");
     String word1 = scanner.nextLine();

     System.out.println("Enter second word: ");
     String word2 = scanner.nextLine();

     System.out.print(word1);
     for (int i = 0; i < 30; i++) {
         System.out.print(".");
     }
     System.out.print(word2);
     }

     public static void ex7() {
     Scanner scanner = new Scanner(System.in);

     System.out.println("Enter a word: ");
     String word = scanner.nextLine();
     
     for (int i = 0; i < word.length(); i++) {
         System.out.println(word.charAt(i));
     }
     }

    

     

     

    } 

