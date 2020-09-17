
package Part2;

import java.util.Scanner;


public class PowerChart {

    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double exp, a,a1,a2,a3,a4,a5,a6,a7,a8,a9,a10;
        
        while(true){
            System.out.print("Enter a number between 0-10: ");
            exp = s.nextInt();
            if(exp>=0 && exp <= 10) break;
            System.out.print("Error, from 0-10. Try Again \n");
        }
        
        if(exp == 0){
            a = Math.pow(2,exp);
            System.out.println(" X                   2^X\n");
            System.out.println("===                 ======= \n ");
            System.out.format("%.2f                  %.2f\n ", exp, a);   
        }
        else if(exp == 1){
            a = Math.pow(2,0);
            a1 = Math.pow(2, exp);
            System.out.println(" X                   2^X\n");
            System.out.println("===                 ======= \n ");
            System.out.format("%.2f                  %.2f\n ", 0.0, a);
            System.out.format("%.2f                  %.2f\n ", exp, a1);
        }
        else if(exp == 2){
            a = Math.pow(2,0);
            a1 = Math.pow(2, 1);
            a2 = Math.pow(2, exp);
            System.out.println(" X                   2^X\n");
            System.out.println("===                 ======= \n ");
            System.out.format("%.2f                  %.2f\n ", 0.0, a);
            System.out.format("%.2f                  %.2f\n ", 1.0, a1);
            System.out.format("%.2f                  %.2f\n ", exp, a2);
        }
        else if(exp == 3){
            a = Math.pow(2,0);
            a1 = Math.pow(2, 1);
            a2 = Math.pow(2, 2);
            a3 = Math.pow(2,exp);
            System.out.println(" X                   2^X\n");
            System.out.println("===                 ======= \n ");
            System.out.format("%.2f                  %.2f\n ", 0.0, a);
            System.out.format("%.2f                  %.2f\n ", 1.0, a1);
            System.out.format("%.2f                  %.2f\n ", 2.0, a2);
            System.out.format("%.2f                  %.2f\n ", exp, a3);
        }
        else if(exp == 4){
            a = Math.pow(2,0);
            a1 = Math.pow(2, 1);
            a2 = Math.pow(2, 2);
            a3 = Math.pow(2,3);
            a4 = Math.pow(2,exp);
            System.out.println(" X                   2^X\n");
            System.out.println("===                 ======= \n ");
            System.out.format("%.2f                  %.2f\n ", 0.0, a);
            System.out.format("%.2f                  %.2f\n ", 1.0, a1);
            System.out.format("%.2f                  %.2f\n ", 2.0, a2);
            System.out.format("%.2f                  %.2f\n ", 3.0, a3);
            System.out.format("%.2f                  %.2f\n ", exp, a4);
        }
        else if(exp == 5){
            a = Math.pow(2,0);
            a1 = Math.pow(2, 1);
            a2 = Math.pow(2, 2);
            a3 = Math.pow(2,3);
            a4 = Math.pow(2,4);
            a5 =Math.pow(2, exp);
            System.out.println(" X                   2^X\n");
            System.out.println("===                 ======= \n ");
            System.out.format("%.2f                  %.2f\n ", 0.0, a);
            System.out.format("%.2f                  %.2f\n ", 1.0, a1);
            System.out.format("%.2f                  %.2f\n ", 2.0, a2);
            System.out.format("%.2f                  %.2f\n ", 3.0, a3);
            System.out.format("%.2f                  %.2f\n ", 4.0, a4);
            System.out.format("%.2f                  %.2f\n ", exp, a5);
        }
        else if(exp == 6){
            a = Math.pow(2,0);
            a1 = Math.pow(2, 1);
            a2 = Math.pow(2, 2);
            a3 = Math.pow(2,3);
            a4 = Math.pow(2,4);
            a5 =Math.pow(2, 5);
            a6 =Math.pow(2, exp);
            System.out.println(" X                   2^X\n");
            System.out.println("===                 ======= \n ");
            System.out.format("%.2f                  %.2f\n ", 0.0, a);
            System.out.format("%.2f                  %.2f\n ", 1.0, a1);
            System.out.format("%.2f                  %.2f\n ", 2.0, a2);
            System.out.format("%.2f                  %.2f\n ", 3.0, a3);
            System.out.format("%.2f                  %.2f\n ", 4.0, a4);
            System.out.format("%.2f                  %.2f\n ", 5.0, a5);
            System.out.format("%.2f                  %.2f\n ", exp, a6);
        }
        else if(exp == 7){
            a = Math.pow(2,0);
            a1 = Math.pow(2, 1);
            a2 = Math.pow(2, 2);
            a3 = Math.pow(2,3);
            a4 = Math.pow(2,4);
            a5 =Math.pow(2, 5);
            a6 =Math.pow(2, 6);
            a7 =Math.pow(2, exp);
            System.out.println(" X                   2^X\n");
            System.out.println("===                 ======= \n ");
            System.out.format("%.2f                  %.2f\n ", 0.0, a);
            System.out.format("%.2f                  %.2f\n ", 1.0, a1);
            System.out.format("%.2f                  %.2f\n ", 2.0, a2);
            System.out.format("%.2f                  %.2f\n ", 3.0, a3);
            System.out.format("%.2f                  %.2f\n ", 4.0, a4);
            System.out.format("%.2f                  %.2f\n ", 5.0, a5);
            System.out.format("%.2f                  %.2f\n ", 6.0, a6);
            System.out.format("%.2f                  %.2f\n ", exp, a7);
        }
        else if(exp == 8){
            a = Math.pow(2,0);
            a1 = Math.pow(2, 1);
            a2 = Math.pow(2, 2);
            a3 = Math.pow(2,3);
            a4 = Math.pow(2,4);
            a5 =Math.pow(2, 5);
            a6 =Math.pow(2, 6);
            a7 =Math.pow(2, 7);
            a8 =Math.pow(2, exp);
            System.out.println(" X                   2^X\n");
            System.out.println("===                 ======= \n ");
            System.out.format("%.2f                  %.2f\n ", 0.0, a);
            System.out.format("%.2f                  %.2f\n ", 1.0, a1);
            System.out.format("%.2f                  %.2f\n ", 2.0, a2);
            System.out.format("%.2f                  %.2f\n ", 3.0, a3);
            System.out.format("%.2f                  %.2f\n ", 4.0, a4);
            System.out.format("%.2f                  %.2f\n ", 5.0, a5);
            System.out.format("%.2f                  %.2f\n ", 6.0, a6);
            System.out.format("%.2f                  %.2f\n ", 7.0, a7);
            System.out.format("%.2f                  %.2f\n ", exp, a8);
        }
        else if(exp == 9){
            a = Math.pow(2,0);
            a1 = Math.pow(2, 1);
            a2 = Math.pow(2, 2);
            a3 = Math.pow(2,3);
            a4 = Math.pow(2,4);
            a5 =Math.pow(2, 5);
            a6 =Math.pow(2, 6);
            a7 =Math.pow(2, 7);
            a8 =Math.pow(2, 8);
            a9 =Math.pow(2, exp);
            System.out.println(" X                   2^X\n");
            System.out.println("===                 ======= \n ");
            System.out.format("%.2f                  %.2f\n ", 0.0, a);
            System.out.format("%.2f                  %.2f\n ", 1.0, a1);
            System.out.format("%.2f                  %.2f\n ", 2.0, a2);
            System.out.format("%.2f                  %.2f\n ", 3.0, a3);
            System.out.format("%.2f                  %.2f\n ", 4.0, a4);
            System.out.format("%.2f                  %.2f\n ", 5.0, a5);
            System.out.format("%.2f                  %.2f\n ", 6.0, a6);
            System.out.format("%.2f                  %.2f\n ", 7.0, a7);
            System.out.format("%.2f                  %.2f\n ", 8.0, a8);
            System.out.format("%.2f                  %.2f\n ", exp, a9);
        }
        else if(exp == 10){
            a = Math.pow(2,0);
            a1 = Math.pow(2, 1);
            a2 = Math.pow(2, 2);
            a3 = Math.pow(2,3);
            a4 = Math.pow(2,4);
            a5 =Math.pow(2, 5);
            a6 =Math.pow(2, 6);
            a7 =Math.pow(2, 7);
            a8 =Math.pow(2, 8);
            a9 =Math.pow(2, 9);
            a10 =Math.pow(2, exp);
            System.out.println(" X                   2^X\n");
            System.out.println("===                 ======= \n ");
            System.out.format("%.2f                  %.2f\n ", 0.0, a);
            System.out.format("%.2f                  %.2f\n ", 1.0, a1);
            System.out.format("%.2f                  %.2f\n ", 2.0, a2);
            System.out.format("%.2f                  %.2f\n ", 3.0, a3);
            System.out.format("%.2f                  %.2f\n ", 4.0, a4);
            System.out.format("%.2f                  %.2f\n ", 5.0, a5);
            System.out.format("%.2f                  %.2f\n ", 6.0, a6);
            System.out.format("%.2f                  %.2f\n ", 7.0, a7);
            System.out.format("%.2f                  %.2f\n ", 8.0, a8);
            System.out.format("%.2f                  %.2f\n ", 9.0, a9);
            System.out.format("%.2f                  %.2f\n ", exp, a10);
        }
        
    }
    
}
