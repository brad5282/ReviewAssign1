package part1;


import java.util.Scanner;


public class Momentum {

   
    public static void main(String[] args) {
        double momentum, mass, velocity;
        
        Scanner s = new Scanner(System.in);
        
        //ask for mass
        System.out.print("Enter object's mass, in kg: ");
        mass = s.nextDouble();
        System.out.print("Enter object's velocity, in m/sec: ");
        velocity = s.nextDouble();
        
        //calculate
        momentum = mass * velocity;
        System.out.println("Object's momentum is " + momentum);
        // or System.out.println(String.format("Object's momentum is %.2f",momentum));
        
    }
    
}
