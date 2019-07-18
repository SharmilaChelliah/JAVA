import java.util.*;
public class MyClass {
    public static void main(String args[]) {
        String s;
        int case_option;
        Scanner sc = new Scanner(System.in);
        s = sc.nextLine();
        case_option = sc.nextInt();
        switch(case_option)
        {
            case 0:
                String ari[]=s.split(" ");
                for(int i=0;i<ari.length;i++)
                {
                    StringBuilder sb = new StringBuilder(ari[i]);
                    System.out.print(sb.reverse().toString()+" ");
                }
                break;
            case 1:
                int l=s.length();
                int[] a=new int[l];
                int k=0;
                char[] st = s.toCharArray();
                for(int i=0;i<st.length;i++)
                {
                    char c=st[i];
                    if(Character.isUpperCase(c))
                    {
                        a[k]=i;
                        k++;
                    }
                }
        /*for(int i=0;i<a.length;i++)
        {
           System.out.println(a[i]);
        }*/
                String arr[] = s.split(" ");
                String s1="";
                String s2="";
                for(int i=0;i<arr.length;i++)
                {
                    StringBuilder sb = new StringBuilder(arr[i]);
                    s1=s1.concat(sb.reverse().toString()+" ");
                    //System.out.print(arr[i]+" ");
                }
                char[] cs=s1.toCharArray();
                int val=0;
                String ss="";
                for(int i=0;i<cs.length;i++)
                {
                    if(i==a[val])
                    {
                        if(Character.isLowerCase(cs[i]))
                        {
                            ss=ss+(Character.toUpperCase(cs[i]));
                        }
                        else
                        {
                            ss=ss+cs[i];
                        }
                        val++;
                    }
                    else
                    {
                        if(Character.isUpperCase(cs[i]))
                        {
                            ss=ss+(Character.toLowerCase(cs[i]));
                        }
                        else
                        {
                            ss=ss+cs[i];
                        }
                    }
                }
                System.out.println(ss);
                break;

            case 2:
                String ss1="";
                String aray[]=s.split(" ");
                for(int i=0;i<aray.length;i++)
                {
                    StringBuilder sb = new StringBuilder(aray[i]);
                    ss1=ss1.concat(sb.reverse().toString()+" ");
                }
                char ary[] = ss1.toCharArray();
                for(int i=0;i<ary.length;i++)
                {
                    char c = ary[i];
                    if(Character.isUpperCase(c))
                    {
                        ary[i]=Character.toLowerCase(c);
                    }
                    else if(Character.isLowerCase(c))
                    {
                         ary[i]=Character.toUpperCase(c);
                    }
                }
                System.out.println(ary);
                break;
        }
    }
}

