class MaxMinEle
{
public static void main(String arg[])
{
int arr[]={12,56,34,23,87,98};
minMax(arr);
}
static void minMax(int arr[])
{
int min=arr[0];
int max=arr[0];
for(int i=0;i<=arr.length-1;i++)
{
if(arr[i]>max)
 {max=arr[i];}
else if(arr[i]<min)
 {min=arr[i];}
}
System.out.println("The minimum elememt in array : "+min);
System.out.println("The maximum elememt in array : "+max);
}
}