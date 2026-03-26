import java.util.Scanner;
public class Loops {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);

/*  //1.Factorial of a number using for loop
      
      System.out.print("Enter a number: ");
      int n=sc.nextInt();
      int fact=1;
      for(int i=1;i<=n;i++)
      {
        fact=fact*i;
      }
      System.out.println("Factorial of "+n+" is: "+fact);
*/  
//2.Find sum of n numbers.

  /*  System.out.print("Enter a number: ");
      int n=sc.nextInt();
      int sum=0;
      int num=n;
      // while(n>0)
      // {
      //   sum=sum+n;
      //   n--;
      // }

      for(int i=1;i<=n;i++)
      {
        sum=sum+i;
      }
      System.out.println("Sum of first "+num+" numbers is: "+sum);

   */
  // 3. Display the multiplication table of a number.

      System.out.print("Enter a number: ");
      int n=sc.nextInt();
      for(int i=1;i<=10;i++)
      {
        System.out.println(n+" x "+i+" = "+(n*i));
      }
      
      sc.close();
    }
}
