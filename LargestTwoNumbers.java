import java.util.*;
public class MyClass{
    public static void main(String args[])
    {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++)
        {
            a[i] = sc.nextInt();
        }
        int temp;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(a[i]>a[j])
                {
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        int l1=a[n-1],l2=a[n-2];
        int s1=a[0],s2=a[1];
        System.out.println("Largest two numbers "+l1+","+l2);
        System.out.println("Largest two numbers "+s1+","+s2);
    }
}

