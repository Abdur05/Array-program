class UnionArr
{
public static void main(String args[])
{
int a[]={1,3,4,5,7};
int b[]={2,3,5,6};
int m=a.length;
int n=b.length;
pUnion(a,m,b,n);
}
static void pUnion(int a[],int m,int b[],int n)
{
int i=0,j=0;
while(i<m & j<n)
{
if(a[i]<b[j])
{
System.out.print(a[i++]+" ");
}
else if(a[i]>b[j])
{
System.out.print(b[j++]+" ");
}
else
{
System.out.print(a[j++]+" ");
i++;
}
}
while(i<m)
{
System.out.print(a[i++]+" ");
}
while(j<n)
{
System.out.print(a[j++]+"");
}
}
}