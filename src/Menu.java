import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by Brittany on 4/5/16.
 */
public class Menu {
    public static String getChoice() {
        return choice;
    }

    public static String choice;



    public static Scanner scanner = new Scanner(System.in);
    public static HashMap<String,Integer> inventoryList = new HashMap<>();

    public static void menu() {


        inventoryList.put("Hats", 3);
        inventoryList.put("Coats", 2);
        inventoryList.put("Shirts", 26);
        inventoryList.put("Shoes", 24);
        inventoryList.put("Pants", 17);

        int i = 0;
        System.out.println("1. Add item to Inventory\n" +
                "2. Remove item from Inventory\n" +
                "3. Update an item's quantity\n" +
                "4. View quantity for specific item\n"+
                "5. Leave Inventory menu");

        choice = scanner.nextLine();
        System.out.println(">" + choice + "<");

        switch (choice) {
            case ("1"): {
                Menu.addItem();
                break;
            }
            case ("2"): {
                Menu.remItem();
                break;
            }
            case ("3"): {
                Menu.updateItem();
                break;
            }
            case ("4"): {
                Menu.viewItem();
                break;
            }
            case ("5"): {
                Menu.leaveMenu();
                break;
            }
            default:
                System.out.println("Didn't mean to select Inventory? No problem, we can " +
                        "can close out for you");
                break;
        }
    }

    public static void addItem(){
        System.out.println("1. What is the name of the item you would like to add? [Hats/Shirts/Shoes/Pants/Coats]");
        String item = scanner.nextLine();
        Integer quantity = inventoryList.get(item);
        Integer upQuantity = inventoryList.get(item) +1;
        if (inventoryList.containsKey(item)) {
            inventoryList.replace(item, quantity, upQuantity);
            System.out.println(inventoryList.get(item));
        }
        else if (! inventoryList.containsKey(item)) {
            int newItemQuantity = 1;
            inventoryList.put(item, newItemQuantity);
            System.out.println(">New " +item+ " quantity is" + inventoryList.containsKey(item) + "<");
        }
    }
    public static void remItem(){
        System.out.println("2. Which item would you like to remove the Inventory? [Hats/Coats/Shirts/Pants/SHoes]");
        String item = scanner.nextLine();
        int quantity = inventoryList.get(item) - 1;
        inventoryList.put(item, quantity);
        System.out.println(item + " has been removed.");
    }
    public static void updateItem(){
        System.out.println("3. Which item would you like to update quantity for?");
        Integer item = scanner.nextInt();
        System.out.println(inventoryList.get(item) + "\n" +
                "Please enter the new quantity amount for " + item);
        int quantity = inventoryList.get(item);
        System.out.println("Quantity for" + item + " has been updated to " + quantity);
    }
    public static void viewItem(){
        System.out.println("Enter the item's name that you would like to view the quantity of. " +
                "[Hats/Shirts/Shoes/Pants/Coats");
        String item = scanner.nextLine();
        System.out.println("Quantity for " + item + " is " + inventoryList.get(item));
    }
    public static void leaveMenu() {
        System.out.println("Thank you for visiting, have a good day.\n\n\n\n\n\n\n\n\n\n\n" +
                "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    }
}
