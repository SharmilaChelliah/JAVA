import java.util.*;
public class SumOfDigits{
int SOD(int a)
{
 int temp=a,n,sum=0;
 if(a<0)
 {
  a=a*-1;
 }
 while(a!=0)
 {
  n=a%10;
  sum=sum+n;
  a=a/10;
 }
 if(sum>9)
 {
  sum = SOD(sum);
 }
 if(temp<0)
 {
  return sum*-1;
 }
 else
 {
  return sum;
 }
}
public static void main(String args[])
{
 int input;
 Scanner sc = new Scanner(System.in);
 input = sc.nextInt();
 SumOfDigits sod = new SumOfDigits();
 System.out.println(sod.SOD(input));
}
}

