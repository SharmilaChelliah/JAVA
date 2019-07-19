import java.util.*;
public class SumExcludingRange{
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
 int r1 = 6; //can also get user range from scanner as r1 and r2
 int r2= 7;
 boolean flag = true;
 int sum=0;
 for(int i=0;i<n;i++)
 {
  if(a[i]!=r1 && flag==true)
  {
   sum=sum+a[i];
  }
  else if(a[i]==r1)
  {
   flag=false;
  }
  else if(a[i]==r2)
  {
   flag=true;
  }
 }
System.out.println(sum);
}
}

  
