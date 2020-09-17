
package Part2;

import java.text.NumberFormat;


public class SalaryTable {

    
    public static void main(String[] args) {
        int salary = 40000;
        int raise;
        NumberFormat nf = NumberFormat.getNumberInstance();
        
        //print column headings 
        System.out.format("%5s", "YEAR");
        System.out.format("%20s", "OLD SALARY");
        System.out.format("%15s", "RAISE");
        System.out.format("%20s\n", "NEW SALARY");
        
        System.out.format("%5s", "======");
        System.out.format("%20s", "============");
        System.out.format("%15s", "========");
        System.out.format("%20s\n", "================");
        
        System.out.format("%5s", "    0 ");
        System.out.format("%20s", "     --     ");
        System.out.format("%15s", "  40,000 ");
        System.out.format("%20s\n","           40,000 ");
        
        for (int year = 1; year <= 10; year+=1) {
            System.out.format("%5d", year);
            System.out.format("%20s",nf.format(salary));
            raise = (int)(.03*salary);//have to cast to intger
            System.out.format("%15s",nf.format(raise));
            salary += raise;
            System.out.format("%20s\n",nf.format(salary));
    }
        System.out.println("===============================================================");
    
    }
}
