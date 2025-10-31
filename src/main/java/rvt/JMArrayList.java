package rvt;
import java.util.ArrayList;
import java.util.Scanner;

public class JMArrayList {
    public static void main(String[] args) {
     
        
    
      }
     public static void onlyTheseNumbers() {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        int number = 0;
        
        while (number >= 0) {
        number = scanner.nextInt();
        list.add(number);
        if (number == -1) {
            break;
        }
       }
      

    
       

     }
     public static void listSize() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        int wordAmount;

        System.out.println("How many words do you want to enter for your list?");
        wordAmount = scanner.nextInt();
        
        System.out.println("Enter " + wordAmount + " words: ");
        for(int i = 0; wordAmount == 0; i ++) {
            wordAmount -= 1;
            String word = scanner.nextLine();
            list.add(word);
            
            }

        System.out.println("Your list: ");
        list.forEach(System.out::println);

        System.out.println("Total elements: " + list.size());


     }
     public static void onTheList() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        System.out.println("Type in name/word to add to the list. Space and Enter to stop.");
        String word;

        while(true) {
        word = scanner.nextLine();
        list.add(word);

        if(word.contains(" ")) 
        {
            break;
        }
    }
    
    System.out.println("Search for?");
    String search = scanner.nextLine();

    if ((search.equals(word))) {
        System.out.println(search + " was found!");
    }
    else {
        System.out.println(search + " was not found!");
    }
     }
     public static void removeLast(ArrayList<String> strings) {
       
     }

    
      
     }