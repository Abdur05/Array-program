class ReverseArr
{
public static void main(String args[])
{
int arr[]={1,2,3,4};
int i=0,temp;
int j=arr.length-1;
while(i<j)
{
temp=arr[i];
arr[i]=arr[j];
arr[j]=temp;
i++;
j--;
}
for(i=0;i<=arr.length-1;i++)
{
System.out.print(arr[i]+" ");
}
//System.out.println();
}
}