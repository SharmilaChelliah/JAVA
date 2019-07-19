import java.util.LinkedHashSet;
import java.util.Arrays;
import java.util.*;
public class RemoveDuplicate{
public static void main(String args[])
{
 int n;
 Scanner sc = new Scanner(System.in);
 n = sc.nextInt();
 Integer[] a = new Integer[n];
 for(int i=0;i<n;i++)
 {
  a[i]=sc.nextInt();
 }
 Arrays.toString(a);
 LinkedHashSet<Integer> lh = new LinkedHashSet<>(Arrays.asList(a));
 Integer[] res = lh.toArray(new Integer[]{});
 StringBuilder sb = new StringBuilder();
 for(int i=0;i<res.length;i++)
 {
  sb.append(res[i]+" ");
 }
 System.out.println(sb.toString());
}
}

