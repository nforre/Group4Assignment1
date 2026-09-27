// Grocery Management System
// Group member names: Journey Forrest, Dhirendra Neupane
import java.util.Scanner;

public class groceryManager {

    // print inventory code logic TASK 1
    public static void printInventory(String[] names, double[] prices, int[] stocks) {
        for (int i = 0; i < names.length; i++) {
            if (names[i] != null) {
                System.out.println("------- INVENTORY -----");
                System.out.println("-----------------------");
                System.out.println("Item number: " + i);
                System.out.println("Item name: " + names[i] + "\nItem Price: " + prices[i] + "$");
                System.out.println("Item stock: " + stocks[i]);
            }
            else {

            }
        }
    }

    // START TASK 2 HERE. make sure to use public static void restockItem(String[] names, int[] stocks, String target, int amount).
    // I don
    public static void restockItem(String[] names, int[] stocks, String target, int amount)
    {

    }


    /**
     * Print function to print out the user options
     * @param names, the array containing item names
     * @param prices, the array containing prices
     * @param stocks, the array contatining stocks
     */
    public static void printMenu(String[] names, double[] prices, int[] stocks) {
        System.out.println("Welcome to the Grocery Management page.");
        Scanner cin = new Scanner(System.in);
        int userInput = 0;
        while(userInput != 3) {
            
            System.out.println("\nPlease, enter your choice: ");
            System.out.println("1. Display inventory");
            System.out.println("2. Restock");
            System.out.println("3. Exit");
            userInput = cin.nextInt();
            
            if(userInput == 1)
            {
                printInventory(names, prices, stocks); // Calling Task 1
            } 
            else if(userInput == 2)
            {   System.out.print("Enter the name of your item: ");
                String target = cin.next();

                System.out.print("Enter amount: ");
                int amount = cin.nextInt();

                restockItem(names, stocks, target, amount); // Calling Task 2
            }
            else 
            {
                System.out.println("Exiting the program"); // exiting the program
            }
        }    
        
    }

    // main function where we test
    public static void main(String[] args) {
        String[] itemNames = new String[10];
        double[] itemPrices = new double[10];
        int[] itemStocks = new int[10];

        // TEMP TESTING DATA
        itemNames[0] = "Oranges";
        itemPrices[0] = 1.39;
        itemStocks[0] = 45;

        itemNames[1] = "Mangoes";
        itemPrices[1] = 1.50;
        itemStocks[1] = 39;

        itemNames[2] = "Onions";
        itemPrices[2] = 1.12;
        itemStocks[2] = 125;



        
        printMenu(itemNames, itemPrices, itemStocks);

        
    }
}

