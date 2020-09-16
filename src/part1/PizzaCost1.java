package part1;


import java.util.Scanner;


public class PizzaCost1 {

   
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double topping, total,size ;
        final double labour = 1.50;
        final double heat = 0.75;
        
        System.out.print("Please enter the size of your pizza in inches:");
        size = s.nextDouble();
        System.out.print("Enter the amount of toppings you would like:");
        topping = s.nextDouble();
        
        //Calculate
        total = (size * 0.5) + (topping * 0.75) + labour + heat;
        System.out.println("Pizza will cost $" + total);
        
    }
    
}
