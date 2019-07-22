import java.util.*;
public class MyClass {
    public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int[] org_arr = new int[n];
       for(int i=0;i<n;i++)
       {
           org_arr[i]=sc.nextInt();
       }
       int[] encoded_arr = new int[n];
       for(int j=0;j<n-1;j++)
       {
           encoded_arr[j]=org_arr[j]+org_arr[j+1];
       }
       encoded_arr[n-1]=org_arr[n-1];
       for(int i=0;i<n;i++)
       {
           System.out.print(encoded_arr[i]+" ");
       }
       System.out.println();
       System.out.println(org_arr[0]);
       int sum=0;
       for(int i=0;i<n;i++)
       {
           sum=sum+org_arr[i];
       }
       System.out.println(sum);
    }
}
