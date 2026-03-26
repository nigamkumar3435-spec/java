//Area of triangle of isosceles triangle 
import java.lang.*;
import java.util.Scanner;

public class AreaTri{
public static void main(String args[])
{
System.out.println("Enter the length,breadth and height of triangle: ");
Scanner sc=new Scanner(System.in);

float l=sc.nextFloat();
float b=sc.nextFloat();
float h=sc.nextFloat();

float s=(l+b+h)/2f;
double area=Math.sqrt(s*(s-l)*(s-b)*(s-h));

System.out.println("Area of triangle is: "+area);
}
}