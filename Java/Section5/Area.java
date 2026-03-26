//To print area of triangle
import java.util.Scanner;
public class Area{
	public static void main(String args[])
	{
		
		System.out.println("Enter the length,breadth and height of triangle: ");
		
		Scanner sc=new Scanner(System.in);
		float length=sc.nextFloat();
		float breadth=sc.nextFloat();
		float height =sc.nextFloat();
		
		float area=breadth*height/2;
		System.out.println("Area of Triangle is: "+area);
	}
}	