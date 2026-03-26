import java.util.Scanner;

public class SChallange2 {
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);

/* 
    //1.Display name of a day based on number.

    System.out.print("Enter the number [1-7]: ");

    int day=sc.nextInt();

    if(day==1)
    {
      System.out.println("Monday");
    }
    else if(day==2)
    {
      System.out.println("Tuesday");
    }
    else if(day==3)
    {
      System.out.println("Wednesday");
    }
    else if(day==4)
    {
      System.out.println("Thursday");
    }
    else if(day==5)
    {
      System.out.println("Friday");
    }
    else if(day==6)
    {
      System.out.println("Saturday");
    }
    else if(day==7)
    {
      System.out.println("Sunday");
    }
     else
     {
       System.out.println("Invalid input! Please enter a number between 1 and 7.");
     }

     sc.close();
*/
     //2.Find type of website based on URL.

      System.out.print("Enter the URL: ");
      String url=sc.nextLine();

      String protocol=url.substring(0,url.indexOf(":"));

      if(protocol.equals("http"))
      {
        System.out.println("This is an HTTP website.");
      }
      else if(protocol.equals("https"))
      {
        System.out.println("This is an HTTPS website.");
      }
      else if(protocol.equals("ftp"))
      {
        System.out.println("This is an FTP website.");
      }

      String ext=url.substring(url.lastIndexOf(".")/*+1 */);//+1 to get the extension without dot and lastIndexOf to get the extension after the last dot

      if(ext.equals(".com"))
      {
        System.out.println("This is a commercial website.");
      }
      else if(ext.equals(".org"))
      {
        System.out.println("This is an organizational website.");
      }
      else if(ext.equals(".net"))
      {
        System.out.println("This is a network website.");
      }
      sc.close();
  }
}
