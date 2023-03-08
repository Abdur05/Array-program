class SubArray
{
static int arr[]=new int[]{1,2,3,4};
static void subArray(int n)
{
for(int i=0;i<n;i++)
{
for(int j=i;j<n;j++)
{
for(int k=i;k<=j;k++)
{
System.out.println(arr[k]+" ");}
}
}
}
public static void main(String arg[])
{
System.out.println("All SubArray are : ");
subArray(arr.length);
}
}