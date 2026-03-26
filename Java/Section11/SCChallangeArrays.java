import java.util.Scanner;
class SCChallangeArrays
{
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
int a[]={1,2,3,4,5,6,7,8,9,10};

//int sum=0;
 /*for(int i=0;i<a.length;i++)
{
{
sum=sum+a[i];
}
System.out.println("Sum of elements of array: "+sum);
}*/

int key;
System.out.println("Enter the key: ");
key=sc.nextInt();
for(int i:a)
{
	if(a[i]==key)
	{
		 System.out.println("The Element at the index "+i+" is: "+a[i]);
	}
}
System.out.println("Element not found.");
}
}