import java.util.*;
public class Palindrome{
public static void main(String args[]){
 String a;
 Scanner scan = new Scanner(System.in );
 a=scan.nextLine();
 Palindrome ob = new Palindrome();
 System.out.println(ob.pl(a));
}
int pl(String x)
{
 String b="";
 int l = x.length();
 for(int i=l-1;i>=0;i--)
 {
   b=b+x.charAt(i);
 }
 if(b.equalsIgnoreCase(x))
 {
   return 1;
 }
 else
 {
   return 2;
 }
}
}

