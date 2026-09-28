import java.util.Scanner;
import javax.swing.JOptionPane;
public class Bai2_6_linear{
    public static void main(String[] args) {
        String str1,str2;
        double a;
       
        str1=JOptionPane.showInputDialog("Please enter a of ax+b=0 : ");
        a=Double.parseDouble(str1);
        str2=JOptionPane.showInputDialog("Please enter b of ax+b=0 : ");
        double b=Double.parseDouble(str2);
        if(a==0) 
        {
            JOptionPane.showMessageDialog(null, "The linear equation has infinitely many solutions");
          
        }
        else 
        {
           
        double c=-b/a;
        JOptionPane.showMessageDialog(null, "The root of linear equation is : "+c);
                  
    }

    }
}