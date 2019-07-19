import java.util.*;
public class ArrayReverse{
public static void reverse_it(int[][] arr)
{
  int rows = arr.length;
  int cols = arr.length;
  int[][] array = new int[rows][cols];
  for(int i=rows-1;i>=0;i--)
  {
   for(int j=cols-1;j>=0;j--)
   {
    array[rows-1-i][cols-1-j]=arr[i][j];
   }
  }
 for(int i=0;i<rows;i++)
 {
  for(int j=0;j<cols;j++)
  {
   System.out.print(array[i][j]+" ");
  }
  System.out.println();
 } 
}
public static void main(String args[]){
int r=2,col=2;
Scanner sc = new Scanner(System.in);
int[][] ar = new int[2][2];
for(int i=0;i<r;i++)
{
 for(int j=0;j<col;j++)
 {
  ar[i][j]=sc.nextInt();
 }
}
reverse_it(ar);
}
}
