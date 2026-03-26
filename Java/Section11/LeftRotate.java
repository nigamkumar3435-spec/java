//This code is not working.
class LeftRotate{
public static void main(String args[])
{
int a[]={3,5,6,7,4,75};

for(int x:a)
 System.out.print(x+",");

System.out.println("");

int temp=a[0];

for(int i=0;i<a.length-1;i++)
{
a[i]=a[i+1];
}

a[a.length-1]=temp;
for(int x:a)
{
 System.out.print(x+",");
 }
 System.out.println("");
 }
 }
 
 