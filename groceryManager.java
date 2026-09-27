// Grocery Management System
// Group member names: Journey Forrest, Dhirendra Neupane
import java.util.Scanner;

public class groceryManager {

    // print inventory code logic
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

    //everyone add ur coding logic under or above printInventory
    public static void printMenu() {
        Scanner cin = new Scanner(System.in);
        int userInput = 0;
        while(userInput != 3) {
            System.out.println("Enter your choice: ");
            System.out.println("1. Display inverntory");
            System.out.println("2. Restock");
            System.out.println("3. Exit");
            userInput = cin.nextInt();
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

        printInventory(itemNames,itemPrices,itemStocks);
    }
}

