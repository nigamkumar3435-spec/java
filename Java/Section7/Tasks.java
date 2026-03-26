import java.util.Scanner;
public class Tasks {
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    //1.Find a nmber is even or odd

    System.out.println("Enter a number: ");
    int n=sc.nextInt();
    if (n%2==0)
    {
      System.out.println("Even");
    }
    else{
      System.out.println("Odd");
    }

    //2.Find person is young or not young.

    // int age=16;
    // if(age>14)
    // {
    //   System.out.println("Young");
    // }
    // else{
    //   System.out.println("Not Young");
    // }

    //3.Find grades for given marks.

    // System.out.println("Enter marks: ");

    // int marks =sc.nextInt();
    // if(marks>90)
    // {
    //   System.out.println("Grade: A");
    // }
    // else if(marks>80)
    // {
    //   System.out.println("Grade: B");
    // }
    // else if(marks>70)
    // {
    //   System.out.println("Grade: C");
    // }
    // else if(marks>60)
    // {
    //   System.out.println("Grade: D");
    // }
    // else
    // {
    //   System.out.println("Grade: F");
    // }
  } 
}
