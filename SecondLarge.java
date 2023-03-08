import java.util.*;
class SecondLarge
{
public static void main(String[] args)
{
int a[]={88,55,99,22,66,33,77};
Arrays.sort(a);
int x=a.length;
System.out.println("Second Largest element : "+a[x-2]);
}
}