// Grocery Management System
// Group member names: Journey Forrest

public class groceryManager {

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

    
    public static void main(String[] args) {
        String[] itemNames = new String[10];
        double[] itemPrices = new double[10];
        int[] itemStocks = new int[10];

        itemNames[0] = "Oranges";
        itemPrices[0] = 1.39;
        itemStocks[0] = 45;

        printInventory(itemNames,itemPrices,itemStocks);
    }
}

