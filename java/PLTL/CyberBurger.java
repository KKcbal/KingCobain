import java.util.Scanner;
public class CyberBurger
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner (System.in);
        Scanner strInput = new Scanner(System.in);
        System.out.println("=============== CyberBurger Menu ==============");
        System.out.println(" (1) CyberBurger");
        System.out.println(" (2) Double Meat CyberBurger");
        System.out.println(" (3) Triple Meat CyberBurger");
        System.out.println(" (4) Jalapeno and Cheese");
        System.out.println(" (5) Bacon and Cheese");
        System.out.println(" (6) Salad");
        System.out.println("================================================");
        System.out.println("Enter the menu item that you want: ");

        int menu = input.nextInt();
        System.out.println("Would you like cheese with that? (yes/no) ");
        String cheese = strInput.nextLine();
        
        double amount = 0;
        String order = "";
        // Menu Prices
        double cyberBurgerPrice = 3.99;
        double  doubleMeatPrice = 4.99;
        double tripleMeatPrice= 5.99;
        double jalapenoCheesePrice = 6.99;
        double baconCheesePrice = 7.99;
        double saladPrice = 8.99;
        // Additional charges
        double cheesePrice = 0.50;
      
        //your code below here
        switch(menu)
        {
            case 1:
                order = "CyberBurger";
                amount = cyberBurgerPrice;
                if (cheese.equals("yes"))
                {
                    order = "CyberBurger with Cheese";
                    amount = amount + cheesePrice;
                }
                break;

            case 2:
                order = "Double Meat CyberBurger";
                amount = doubleMeatPrice;
                if (cheese.equals("yes"))
                {
                    order = "Double Meat CyberBurger with Cheese";
                    amount = amount + cheesePrice;
                }
                break;
            case 3:
                order = "Triple Meat CyberBurger";
                amount = tripleMeatPrice;
                if (cheese.equals("yes"));
                {
                    order = "Triple Meat CyberBurger with Cheese";
                    amount = amount + cheesePrice;
                }
                break;
            case 4:
                order = "Jalapeno";
                amount = jalapenoCheesePrice;
                if (cheese.equals("yes"))
                {
                    order = "Jalapeno and Cheese";
                    amount = jalapenoCheesePrice + cheesePrice;
                }
                break;
            case 5:
                order = "Bacon and Cheese";
                amount = baconCheesePrice;
                if (cheese.equals("yes")) 
                {
                    order = "Bacon and Cheese with Cheese"; 
                    amount = amount + cheesePrice;
                }
                break;
            case 6:
                order = "Salad";
                amount = saladPrice;
                if (cheese.equals("yes"))
                {
                    order = "Salad with Cheese";
                    amount = amount + cheesePrice;
                }
                break;
        }

        double tax = (8.25*amount)/100;
        amount = tax + amount;


    System.out.print("Your order is " + order + " Your total is $");
    System.out.printf("%.2f", amount);
    // System.out.printf("Your order is "+order+". Your total is $ %.2f", amount);

    }
}