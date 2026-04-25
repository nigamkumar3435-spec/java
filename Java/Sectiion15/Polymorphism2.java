class Super
{
    public void display()
    {
        System.out.println("Super Display");
    }
}
class Sub extends Super
{
    public void display()
    {
        System.out.println("Sub Display");
    }
}

public class Polymorphism2 
{
    public static void main(String[] args) 
    {
//        Super s1=new Super();
//        s1.display();  //--> Super Display
        
        Super s2=new Sub(); // This is dynamic method dispatch.
        s2.display();  //--> O/P:- Super Display & Sub Display
    }   
}
// It is run time polymorphism
