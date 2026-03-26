import java.util.Scanner;
public class SChallange1 {
  public static void main(String ar[])
  {
    Scanner sc=new Scanner(System.in);

    //1.Find a given year is a leap year or not.

    // System.out.println("enter the year");
    // int year=sc.nextInt();
    /*if(year%4==0)
    {
      // if(year%100 !=0 || year%400==0)
      // {
      //   System.out.println("leap year");
      // }
      // else
      // {
      //   System.out.println("not a leap year");
      // }
    }*/
   //---------------------------------------------
   /*if(year%4==0) 
   {  
    if(year%100==0)
      {
        if(year%400==0)
        {
          System.out.println("leap year");
        }
        else
        {
          System.out.println("not a leap year");
        }
      }
    }*/

      //2.Find radix of a number given in a string.

       System.out.print("Enter the number in string: ");
       String s=sc.nextLine();

       if(s.matches("[01]+"))
       {
          System.out.println("Binary Radix = 2");
       }
       else if (s.matches("[0-7]+"))
       {
          System.out.println("Octal Radix = 8");
       }
       else if (s.matches("[0-9]+"))
       {
          System.out.println("Decimal Radix = 10");
       }
       else if(s.matches("[0-9A-Fa-f]+"))
       {
          System.out.println("Hexadecimal Radix = 16");
       }
       else
       {
          System.out.println("Invalid number format");
       }
  }
}
