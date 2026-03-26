import java.util.Scanner;
public class SwitchCase 
{
  public static void main(String args[])
  {
      Scanner sc=new Scanner(System.in);
/*    System.out.print("Enter the day number[1-7]: ");
      int day=sc.nextInt();
      switch(day)
      {
          case 1 : System.out.println("Monday");break;
          case 2 : System.out.println("Tuesday");break;
          case 3 : System.out.println("Wednesday");break;
          case 4 : System.out.println("Thursday");break;
          case 5 : System.out.println("Friday");break;
          case 6 : System.out.println("Saturday");break;
          case 7 : System.out.println("Sunday");break;
          default : System.out.println("Invalid day number");  

          case 1 -> System.out.println("Monday");
          case 2 -> System.out.println("Tuesday");
          case 3 -> System.out.println("Wednesday");
          case 4 -> System.out.println("Thursday");
          case 5 -> System.out.println("Friday");
          case 6 -> System.out.println("Saturday");
          case 7 -> System.out.println("Sunday");
          default -> System.out.println("Invalid day number");  

          case 1:
            System.out.println("Monday");
            break;
          case 2:
            System.out.println("Tuesday");
            break;
          case 3:
            System.out.println("Wednesday");
            break;  
          case 4:
            System.out.println("Thursday");
            break;
          case 5: 
            System.out.println("Friday");
            break;    
          case 6:
            System.out.println("Saturday");
            break;
          case 7:
            System.out.println("Sunday");
            break;  
          default:
            System.out.println("Invalid day number");          
      }*/
    System.out.print("Enter domain name: ");
    String domain=sc.nextLine();
    String ext=domain.substring(domain.lastIndexOf(".")+1);
    switch(ext)
    {
      // case "com" : System.out.println("Commercial");break;
      // case "org" : System.out.println("Organization");break;
      // case "gov" : System.out.println("Government");break;
      // default : System.out.println("Unknown extension");

      case "com" -> System.out.println("Commercial");
      case "org" -> System.out.println("Organization");
      case "gov" -> System.out.println("Government");
      default -> System.out.println("Unknown extension");
    }  
  }
}
