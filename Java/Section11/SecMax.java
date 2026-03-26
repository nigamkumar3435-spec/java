class SecMax
{
public static void main(String args[])
{
int a[]={3,5,22,5,6,27,32};

int max1,max2;

max1=max2=a[0];

for(int i=0;i<a.length;i++)
{
if(max1<a[i])
{
max2=max1;
max1=a[i]; 
}
else if (a[i]>max2)
{
max2=a[i];
}
}
System.out.println(max2);
}
}