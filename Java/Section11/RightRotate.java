class RightRotate
{
public static void main(String args[])
{
int a[]={3,2,77,4,43,67,32};
 
 int temp=a[a.length-1];
 
 for(int x:a)
{
 System.out.print(x+",");
 }
 System.out.println("");
 
 for(int i=a.length-1;i>0;i--)
 {
 a[i]=a[i-1];
 }
 a[0]=temp;
 
 for(int x:a)
{
 System.out.print(x+",");
 }
 System.out.println("");
 }
 }