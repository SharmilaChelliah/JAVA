import java.util.*;
public class MaximumLcm{
public static void main(String [] args)
{
 int n,max=0;
 Scanner sc = new Scanner(System.in);
 n = sc.nextInt();
 int[] a = new int[n];
 for(int i=0;i<n;i++)
 {
  a[i] = sc.nextInt();
 }
 for(int i=0;i<n-1;i++)
 {
  int gd = gcd(a[i],a[i+1]);
  int lcm = (a[i]*a[i+1])/gd;
  if(lcm>max)
  {
   max=lcm;
  }
 }
 System.out.println(max);
}
public static int gcd(int a,int b)
{
 if(a==0)
 {
  return b;
 }
 else
 {
  return gcd(b%a,a);
}
}
}
