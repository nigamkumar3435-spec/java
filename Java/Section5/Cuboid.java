import java.lang.*;
import java.util.Scanner;

class Cuboid{
public static void main(String args[])
{
int l,b,h;
int area,volume;

System.out.println("Enter length,breadth and height: ");
Scanner sc=new Scanner(System.in);
l=sc.nextInt();
b=sc.nextInt();
h=sc.nextInt();

volume=l*b*h;
area=2*((l*b)+(b*h)+(l*h));

System.out.println("Volume and Area of Cuboid are "+volume+" and "+area+" respectively.");
}
}