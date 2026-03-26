class RotateArray
{
public static void main(String args[])
{
int a[]={3,2,77,4,43,67,32};
 
 int temp=a[0];
 
 for(int x:a)
{
 System.out.print(x+",");
 }
 System.out.println("");
 
 for(int i=1;i<a.length;i++)
 {
 a[i-1]=a[i];
 }
 a[a.length-1]=temp;
 
 for(int x:a)
{
 System.out.print(x+",");
 }
 System.out.println("");
 }
 }