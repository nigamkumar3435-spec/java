class Array1d
{
public static void main(String args[])
{
int a[]=new int[10];

int b[]={1,2,3,4,5};

int c[];
c=new int[10];

b[3]=20;

for(int i=0;i<b.length;i++)
{
	System.out.println(b[i]++);
}
//for(int i=0;i<b.length;i++)
for(int i:b)
{
System.out.println(i);
//System.out.println(b[i]);
}

}
}
