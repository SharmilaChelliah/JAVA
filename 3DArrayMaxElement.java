import java.util.*;
public class BiggestNumber{
public static void main(String[] args)
{
 int r=3,col=3;
 Scanner sc = new Scanner(System.in);
 Integer[][] ar = new Integer[r][col];
 for(int i=0;i<r;i++)
 {
 for(int j=0;j<col;j++)
 {
  ar[i][j]=sc.nextInt();
 }
 }
 int max=0;
 for(int i=0;i<r;i++)
 {
 for(int j=0;j<col;j++)
 {
  if(ar[i][j]>max)
  {
   max=ar[i][j];
  }
 }
 }
System.out.println(max);
}
}

