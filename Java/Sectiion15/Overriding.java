class Super
{
    public void display()
    {
        System.out.println("Super Class Display 1");
    }
}
class Sub extends Super
{
    @Override
    public void display()
    {
        System.out.println("Sub Class Display 2");
    }
}
public class Overriding 
{
    public static void main(String[] args) 
    {
        Super sup=new Super();
        sup.display();
        
        Sub s=new Sub();
        s.display();
        
        Super sub=new Sub();   //This mechanism is called dynamic dispatch method in java, where superclass reference holds the object of subclass.
        sub.display();
    }   
}

