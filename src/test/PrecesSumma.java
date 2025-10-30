package rvt;

import java.util.Scanner;

public class PrecesSumma {
    public static void main(String[] args) {
        final int skruviPrice = 5;
        final int uzgriezniPrice = 3;
        final int paplaksniPrice = 1;
        int result_price = 0;

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ievadīt skruvju skaits: ");
        int skruvjuSum = scanner.nextInt();
        System.out.println("Ievadīt uzgrieznu skaits: ");
        int uzgrieznuSum = scanner.nextInt();
        System.out.println("Ievadīt paplaksnu skaits: ");
        int paplaksniSum = scanner.nextInt();

        if (uzgrieznuSum < skruvjuSum) {
            System.out.println("Pārbaudi pārsutijumu.");
        }
        else if (skruvjuSum > Math.pow(paplaksniSum, 2)) {
            System.out.println("Par māz paplakšņu.");
        }
        else {
            result_price = skruviPrice * skruvjuSum + uzgriezniPrice * uzgrieznuSum + paplaksniPrice * paplaksniSum;
            System.out.println("Pasūtījums ir kartībā.");
            System.out.println("Kopēja cena: " + result_price);
        }
    }
}