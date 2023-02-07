class ReverseArr2
{
public static void main(String ar[])
{
int arr[]={1,2,3,4,5};
revArr(arr);
}
static void revArr(int arr[])
{
for(int i=arr.length-1;i>=0;i--)
{
System.out.print(arr[i]+" ");
}
}
}