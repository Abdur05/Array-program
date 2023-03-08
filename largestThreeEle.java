import java.util.*;
class largestThreeEle
{
public static void main(String ar[])
{
int [] a={11,33,44,55,77,88};
Arrays.sort(a);
int x=a.length;
System.out.println("First largest : "+a[x-1]);
System.out.println("Second largest : "+a[x-2]);
System.out.println("Third Largest : "+a[x-3]);
}
}