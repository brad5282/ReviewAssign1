package part1;

import TurtleGraphics.*;
import java.awt.Color;
import java.util.Scanner;
public class BarChart {

    static SketchPadWindow win = new SketchPadWindow(500,400);
    static Pen p = new StandardPen(win);
    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
       int v1, v2, v3, v4;
       
       //drawing x axis
        p.setColor(Color.black);
        p.setWidth(10);
        p.up();
        p.move(-250,-150);
        p.down();
        p.move(250,-150);
       
        System.out.print("Enter value 1 of 4: ");
        v1 = s.nextInt();
        System.out.print("Enter value 2 of 4: ");
        v2 = s.nextInt();
        System.out.print("Enter value 3 of 4: ");
        v3 = s.nextInt();
        System.out.print("Enter value 4 of 4: ");
        v4 = s.nextInt();
        
        
        
        
        //drawing bars
        p.setWidth(50);
        makeBar(p, -180,-120, v1, Color.red);
        makeBar(p,-70, -120, v2, Color.blue);
        makeBar(p, 40, -120,v3, Color.green);
        makeBar(p, 160, -120, v4, Color.yellow);
       
    }
    
    public static void makeBar(Pen p, int xloc, int yloc, int length, Color col){
        p.up();
        p.move(xloc, yloc);
        p.down();
        p.setColor(col);
        p.setDirection(90);
        p.move(length);
        p.up();
        p.move(15);
        p.down();
        p.up();
        p.setColor(Color.black);
        p.move(xloc,-170);
        p.drawString(""+ length);
    
    }
    
}
