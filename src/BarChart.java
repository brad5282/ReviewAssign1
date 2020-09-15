import TurtleGraphics.*;
import java.util.Scanner;
public class BarChart {

    static SketchPadWindow win = new SketchPadWindow(850,670);
    static Pen p = new StandardPen(win);
    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
       int v1, v2, v3, v4;
       
        System.out.println("Enter value 1 of 4: ");
        v1 = s.nextInt();
        System.out.println("Enter value 2 of 4: ");
        v2 = s.nextInt();
        System.out.println("Enter value 3 of 4: ");
        v3 = s.nextInt();
        System.out.println("Enter value 4 of 4: ");
        v4 = s.nextInt();
       
    }
    
}
