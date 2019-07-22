import java.util.*;
public class MyClass {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String inp = sc.nextLine();
        System.out.println(digit(inp));
    }
    public static int digit(String s)
    {
        String[] arr=s.split(" ");
        int ln,n,sum=0,temp;
        String len ="";
        for(int i=0;i<arr.length;i++)
        {
            ln=arr[i].length();
            String sp=ln+"";
            if(ln<10)
            {
                len=len+sp;
            }
            else
            {
                temp=ln;
                while(temp!=0)
                {
                    n=temp%10;
                    sum=sum+n;
                    temp=temp/10;
                }
                len=len+sum;
            }
        }
        int result = Integer.parseInt(len);
        return result;
    }
}
