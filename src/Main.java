import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter price of item: ");

        if(in.hasNextDouble())
        {
            double itemPrice = in.nextDouble();
            in.nextLine();

            if (itemPrice >= 100)
            {
                System.out.println("The final price of your purchase is " + itemPrice + ". There is no shipping cost.");
            }
            else
            {
                double shippingTax = itemPrice * .02;
                double finalPrice = itemPrice + shippingTax;
                System.out.println("Your order has a shipping cost of " + shippingTax + ", leading to a final cost of " + finalPrice);
            }
        }
        else
        {
            System.out.println("Please redo program and enter valid input");
        }
    }
}