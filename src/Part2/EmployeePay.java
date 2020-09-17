
package Part2;

import java.util.Scanner;


public class EmployeePay {

    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double totpay =0, totot = 0, grandtot =0;
        double hours, ot, pay,tot;
        
        for (int i = 1; i <= 5; i++) {
            while(true){
                System.out.print("Enter Hours Worked for Employee " + i + ": ");
                hours = s.nextDouble();
                if(hours >= 1 && hours <= 70) break;
                else {
                    System.out.println("Invalid, try again.");
                    }
            }
            if(hours > 40){
                ot = (hours - 40)* 22.5;
                pay = 40 * 15;
                tot = ot + pay; 
            }
            else{
                pay = hours * 15;
                ot = 0;
                tot = pay + ot;
            }
            grandtot+= tot;
            totot+= ot;
            totpay += pay;
            
            System.out.println("Regular Pay: " + pay);
            System.out.println("Overtime Pay: " + ot);
            System.out.println("Total Pay: " + tot);
            System.out.println("------------------------------\n");
            
            
        }
        System.out.println("Total Regular Pay: " + totpay);
        System.out.println("Total Overtime Pay: " + totot);
        System.out.println("Grand Total Pay: " + grandtot);
    }
    
}
