import java.util.*;
public class MyClass {
    public static void main(String args[]) {
        Scanner o = new Scanner(System.in);
        int input = o.nextInt();
        if(input<50)
        {
            System.out.println("Fail");
        }
        else if(input>=50 && input<60)
        {
            System.out.println("E grade");
        }
        else if(input>=60 && input<70)
        {
            System.out.println("D grade");
        }
        else if(input>=70 && input<80)
        {
            System.out.println("C grade");
        }
        else if(input>=80 && input<90)
        {
            System.out.println("B grade");
        }
        else if(input>=90 && input<95)
        {
            System.out.println("A grade");
        }
        else if(input>=95 && input<=100)
        {
            System.out.println("S grade");
        }
        else if(input>100)
        {
            System.out.println("Enter marks less than 100");
        }
        else
        {
            System.out.println("Enter valid mark");
        }
    }
}
