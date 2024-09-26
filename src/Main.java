import java.sql.SQLOutput;
import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String trash = "";
        double itemPrice = 0;
        double shipCost = 0;
        double totalCost = 0;
        final double SHIP_CUTOFF = 100;
        final double SHIP_RATE = 0.02;

        System.out.print("Enter the price of your item:");

        if(in.hasNextDouble())
        {
            itemPrice = in.nextDouble();
            if(itemPrice>=SHIP_CUTOFF)
         {
                System.out.println("Since your item is more than $100, your shipping cost is free.");
         }
            else
            {
             shipCost = itemPrice*SHIP_RATE;
            }
            totalCost = shipCost+itemPrice;
            System.out.println("Your item price is: $" + itemPrice);
            System.out.println("Your shipping cost is: $" + shipCost);
            System.out.println("Your total cost is: $" + totalCost);
        }
        else
        {
            trash = in.nextLine();
            System.out.println("You entered " + trash + ", not a number!");
            System.out.println("Run the program again with correct input.");
        }




    }
}