import java.util.*;
import java.lang.*;
import javax.swing.*;

public class ComputerMethods5026211092{


        // C-F
        public double fToC(double degreesF){
            float degreesC = (float)5 / 9 ;
            double result = degreesC * (degreesF - 32);
            JOptionPane.showMessageDialog(null,"Temp in celcius is " + result);
            return degreesC;

        }

        // hypotenuse
        public  double hypotenuse(int a, int b){
            double c = Math.sqrt((a*a)+ (b*b));
            JOptionPane.showMessageDialog(null,"Hypotenuse is " + c);
            return c;

        }

        // dice
        public int roll(){
            Random RNum = new Random();
            int dice1 = RNum.nextInt(6) + 1;
            int dice2 = RNum.nextInt(6) + 2;
            int sumdice = dice1 + dice2;
            JOptionPane.showMessageDialog(null,"The sum of the dice values is "+ sumdice);
            return sumdice;
        }
}