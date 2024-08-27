package PS2;

/*
 * TerrierShipping.java
 * CS 112, Boston University
 *
 * Completed by: your name and email
 * 
 * Calculates the total shipping charge for a collection of items.
 */

import java.util.*;

public class TerrierShipping {     
    /*
     * getShippingType - gets the type of shipping as an integer
     */
    public static int getShippingType(Scanner console){
        System.out.println("Available shipping types:");
        System.out.println("  1) one-day");
        System.out.println("  2) two-day");
        System.out.println("  3) standard");
        System.out.println();
        
        System.out.print("What type of shipping? (enter the number) ");
        int type = console.nextInt();
        return type;
    }

    /*
     * getItemType - gets the type of item as a single-character string
     */
    public static String getItemType(Scanner console){
        System.out.println();
        System.out.println("Item type:");
        System.out.println("  B) book");
        System.out.println("  C) clothing");
        System.out.println("  E) electronics");
        System.out.println("  T) toy");
        System.out.println();
        
        System.out.print("What type of item? (enter the letter or Q to quit) ");
        String itemType = console.next();
        return itemType;
    }
    
    /* 
     * PUT YOUR ADDITIONAL HELPER METHODS HERE.
     * Remember that you must have at least three additional methods that:
     *   - take one or more parameters
     *   - return a value 
     */
    
     /*
    public static int oneDayShipping(Scanner console){
        String item = getItemType(console);
        //int shipping = getShippingType(console);
        int cost = 0;
        if (item == "B"){
            cost = 499;
        } else if ( item == "C"){
            cost = 399;
        } else if (item == "T"){
            cost = 499;
        } else {
            cost = 599;
        }
        return cost;
        }
    */
    public static int Toy(int shipping){
    
        int cost = 0;
        if (shipping == 1){
            cost = 499;
        } else if (shipping == 2){
            cost = 299;
        } else{
            cost = 199;
        } return cost;
    }
    public static int Electronics(int ship){
        
        int cost1 = 0;
        if (ship == 1){
            cost1 = 599;
        } else if (ship == 2){
            cost1 = 399;
        } else{
            cost1 = 199;
        } return cost1;
    }

    public static int booksAndClothes(int shipp){
        //int shipping = getShippingType(console);
        int cost2 = 0;
        if (shipp == 1){
            cost2 = 499;
        } else if (shipp == 2){
            cost2 = 299;
        } else{
            cost2 = 199;
        } return cost2;
    }

    public static void main(String[] args){
        Scanner console = new Scanner(System.in);    // for user input
        
        System.out.println("Welcome to Terrier Shipping!");
        System.out.println();
        int shipType = getShippingType(console);
        
        int totalCents = 0;
        boolean hasMoreItems = true;
        
        /*
         * Process one item at a time until the user enters Q. 
         * We use a do-while loop, because we always need 
         * at least one repetition of the loop.
         */
        do {
            String itemType = getItemType(console);       
            if (itemType.equals("Q")) {
                hasMoreItems = false;
            } else {            
                /*
                 * TO DO: update the right-hand side of the assignment 
                 * statement below to get an integer from the user. 
                 * You MUST use the Scanner object created above 
                 * at the start of main. You may NOT construct an 
                 * additional Scanner object.
                 */
                System.out.print("Weight of item (rounded to nearest pound)? ");
                int weight = console.nextInt();
        
                int itemCharge = 0;
            
                /*
                 * TO DO: Add code here that uses conditional execution to 
                 * call one of your static methods to determine the charge
                 * for the current item and assign it to itemCharge.
                 */
                
                //int toy = Toy(shipType); 
                //int electronic = Electronics(shipType);
                //int bc = booksAndClothes(shipType);
                int totalToy;
                int totalE;
                int totalBC;
                 if (shipType == 1){
                    if (itemType.equals("T")){
                        totalToy = Toy(shipType) + (199 * weight);
                        itemCharge += totalToy;
                    } else if (itemType.equals("E")){
                        totalE = Electronics(shipType) + (199*weight);
                        itemCharge += totalE;
                    } else {
                        if (weight >= 2){
                            totalBC = 399 + (60*weight);
                        } else{
                            totalBC = booksAndClothes(shipType);
                        }
                        itemCharge += totalBC;
                    }
                   
                } else if (shipType == 2){
                    if (itemType.equals("T")){
                        totalToy = Toy(shipType) + (99 * weight);
                        itemCharge += totalToy;
                    }
                    else if (itemType.equals("E")){
                        totalE = Electronics(shipType) + (89*weight);
                        itemCharge += totalE;
                    } else{
                        if (weight >= 2){
                            totalBC = 199 + (75*weight);
                        } else{
                            totalBC = booksAndClothes(shipType);
                        }
                        itemCharge += totalBC;
                    }
    
                } else{
                    if (itemType.equals("T")){
                        totalToy = Toy(shipType) + (80*weight);
                        itemCharge += totalToy;
                    } else if (itemType.equals("E")){
                        totalE = Electronics(shipType) + (80*weight);
                        itemCharge += totalE;
                    } else{
                        if (weight >= 2){
                            totalBC = 99 + (70*weight);
                        } else{
                            totalBC = booksAndClothes(shipType);
                        }
                        itemCharge += totalBC;
                    }
                }
                
                totalCents += itemCharge;
            }
        } while (hasMoreItems == true);
            
        System.out.println();
        
        /*
         * TO DO: add the appropriate expression to the right-hand side 
         * of this assignment statement to convert totalCents to dollars.
         */
        double totalDollars = totalCents / 100.0;      
        
        // We use printf to ensure that the final result always has
        // two digits after the decimal. 
        System.out.printf("The total charge is: $%.2f\n", totalDollars);   

        console.close();
    }
}