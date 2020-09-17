
package Part2;

import java.util.Scanner;


public class Divide {

    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num1, num2,rem, a, max, min;
        
        //gathering numbers
        System.out.print("Enter a number: ");
        num1 = s.nextInt();
        System.out.print("Enter another number: ");
        num2 = s.nextInt();
        
        //determining the max & min
        max = Math.max(num1, num2);
        min = Math.min(num1, num2);
        System.out.println(max + " is the larger number, and the smaller number is " + min);
        
        //calculations
        a = max/min;
        rem = max % min;
        
        //print
        System.out.format("The answer is %dr %d\n", a,rem);
    }
    
}
