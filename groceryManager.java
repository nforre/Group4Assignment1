// Grocery Management System
// Group member names: Journey Forrest, Dhirendra Neupane, Armando Padron
import java.util.Scanner;

/**
 * The GroceryManager class is created to simulate managing 
 * inventory data in a grocery store. It prints out the inventory, allows
 * for the search and restock of an item. The grocery store data is all 
 * accessible through a printed menu.
 * 
 */
public class GroceryManager {

    /**
     * The printInventory function prints out the list of items in 
     * the grocery inventory. The function prints out the items name, price,
     * and amount in stock.
     * 
     * @param names  array of item names
     * @param prices array of item prices
     * @param stocks array of amount item(s) have in stock
     */
    public static void printInventory(String[] names, double[] prices, int[] stocks) {
        System.out.println("\n------ INVENTORY ------");
        System.out.println("-----------------------");
        for (int i = 0; i < names.length; i++) {
            if (names[i] != null) {
                
                System.out.println("Item number: " + i);
                System.out.println("Item name: " + names[i] + "\nItem Price: $" + prices[i]);
                System.out.println("Item stock: " + stocks[i]);
                System.out.println("-----------------------");
            }
            else {

            }
        }
    }

    /**
     * Searches for an item by name in the inventory and increases its stock amount.
     * If the item is not found, displays an error message.
     *
     * @param names  array of item names
     * @param stocks array of current item stock quantities
     * @param target the name of the item to restock
     * @param amount the quantity to add to the existing stock
     */
    public static void restockItem(String[] names, int[] stocks, String target, int amount)
    {
        boolean found = false;
        for(int i = 0; i < names.length; i++)
        {
            if(names[i] != null && names[i].equalsIgnoreCase(target))
            {
                stocks[i] += amount;
                found = true;
                break;
            }
        }
        if(!found)
        {
            System.out.println("Item is not found. Please search again.");
        }
    }


    /**
     * Print menu function to print out the user options.
     * 
     * @param names  the array containing item names
     * @param prices the array containing prices
     * @param stocks the array containing stocks
     */
    public static void printMenu(String[] names, double[] prices, int[] stocks, Scanner cin) {
        while(true) {
            System.out.println("\nWelcome to the Grocery Management page.");
            System.out.println("\nPlease, enter your choice: ");
            System.out.println("1. Display inventory");
            System.out.println("2. Restock");
            System.out.println("3. Exit");
            int userInput = cin.nextInt();
            cin.nextLine();
            
            if(userInput == 1)
            {
                printInventory(names, prices, stocks); // Calling Task 1
            } 
            else if(userInput == 2)
            {   System.out.print("\nEnter the name of your item: ");
                String target = cin.nextLine();

                System.out.print("Enter amount: ");
                int amount = cin.nextInt();

                restockItem(names, stocks, target, amount); // Calling Task 2
            }
            else 
            {
                System.out.println("Exiting the program");
                break; // exiting the program
            }
        }  
    }

    /**
     * Main function used to create grocery items
     * and print out data. Uses a scanner to read user input.
     * The menu loop is handled in printMenu().
     * 
     * @param args takes in arguments
     */
    public static void main(String[] args) {
        String[] itemNames = new String[10];
        double[] itemPrices = new double[10];
        int[] itemStocks = new int[10];
        Scanner cin = new Scanner(System.in);

        // Adding inventory data
        itemNames[0] = "Oranges";   itemPrices[0] = 1.39;   itemStocks[0] = 45;
        itemNames[1] = "Mangoes";   itemPrices[1] = 1.50;   itemStocks[1] = 39;
        itemNames[2] = "Onions";    itemPrices[2] = 1.12;   itemStocks[2] = 125;
        itemNames[3] = "Bananas";   itemPrices[3] = 1.35;   itemStocks[3] = 40;
        itemNames[4] = "Bell Pepper";   itemPrices[4] = 1.75;   itemStocks[4] = 36;
        itemNames[5] = "Apples";    itemPrices[5] = 1.10;   itemStocks[5] = 17;

        printMenu(itemNames, itemPrices, itemStocks, cin);  
        cin.close();
    }
}

