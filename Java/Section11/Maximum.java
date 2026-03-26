class Maximum
{
public static void main(String args[])
{
int a[]={9,4,7,3,6,37};

int max=a[0];
int i;
for(i=1;i<a.length;i++)
{
if(max<a[i])
{
	max=a[i];
}	
}
System.out.println("Maximum number is: "+max);
}
}