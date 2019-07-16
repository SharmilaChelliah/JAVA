import java.util.*;
public class MyClass {
    public static void main(String args[]) {
        Scanner inp = new Scanner(System.in);
        int number = inp.nextInt();
        int fact = 1;
        for(int i=1;i<=number;i++)
        {
            fact = fact * i;
        }
        System.out.println(fact);
    }
}
