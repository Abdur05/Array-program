import java.util.*;
class RemDupEle
{
public static void main(String arg[])
{
int arr[]={1,2,3,2,4,3,5,4,5};
int n=arr.length-1;
int i,j=0;
Arrays.sort(arr);
System.out.println(arr);
for( i=0;i<n;i++)
{
if(arr[i] != arr[i+1])
	arr[j++]=arr[i];
}
arr[j++]=arr[n];
for(int k=0;k<j;k++)
{
System.out.println(arr[k]+" ");
}
}
}