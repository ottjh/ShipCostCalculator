import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main
{
    public static void main(String[] args)
    {
        //declare and zero variables productCost, shippingCost, and totalCost
        //output "What is your products total cost: " and give input line
        //Make sure it is an integer then test if its 100$ or more
        //If its over 100 then it's free, if not then multiply product cost by .02 to derive shippingCost
        //total cost is productCost+shippingCost
        //output both totalCost and shippingCost
        Scanner in = new Scanner(System.in);
        double productCost = 0.0;
        double shipCost = 0.0;
        double totalCost = 0.0;
        String trash = "";
        System.out.print("Please enter the product's cost: ");

        //We are testing to see if they entered a valid number
        if(in.hasNextDouble())
        {
            productCost = in.nextDouble();
            in.nextLine();
        }
        else
        {
            trash = in.nextLine();
            System.out.println("Please enter a valid cost not :" + trash);
            System.out.println("Please run the program again with only a numeric value.");
            System.exit(0);
        }
        //Now we test if the value is high enough to qualify for free shipping
        if(productCost < 100.0)
        {
            shipCost = productCost * 0.02;
            totalCost = productCost + shipCost;
            System.out.println("The total cost is: " + totalCost + ". The shipping cost is: " + shipCost + ".");
        }
        else
        {
            System.out.println("Your shipping is free. All you need to do is pay is the cost of the product.");
        }
    }
}