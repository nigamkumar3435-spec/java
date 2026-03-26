import java.util.Scanner;

public class SCChallange1 {
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);

/*  //1.2. Write a program to display and count the number of digits in a number.

    System.out.print("Enter the digit: ");
    int n=sc.nextInt();
    int len=String.valueOf(n).length();
    int rem,i;
    int count=0;
    // for(i=0;i<len;i++)
    // {
    //   rem=n%10;
    //   n=n/10;
    //   System.out.println(rem);  
    // }

    while(n>0)
    {
      rem=n%10;
      n=n/10;
      System.out.println(rem);
      count++ ;
    }
    System.out.println("Number of digits: " + count);
*/
    //3. Finding a number is Armstrong or not.

    System.out.print("Enter the number: ");
    int num=sc.nextInt();
    int original=0;

    int rem;
    while(num>0)
    {
      rem=num%10;
      num=num/10;
      System.out.println(rem);
      
     original=original+(rem*rem*rem);
     
    }
     System.out.println(original);
    if(original==num)
    {
      System.out.println("Armstrong number");
    }
    else
    {
      System.out.println("Not an Armstrong number");
    }
   
    sc.close();
  }
}
