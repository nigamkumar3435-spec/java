class Rectangle
{
    int length;
    int breadth;
    
    Rectangle(int length, int breadth)
    {
        this.length=length;
        this.breadth=breadth;
    }
    
    int display()
    {
        System.out.println("Length: "+this.length);
        System.out.println("Breadth: "+this.breadth);
        
        return 0;
    }
}
public class ThisKey
{
    public static void main(String[] args) 
    {
//        Rectangle r1=new Rectangle();
        Rectangle r2=new Rectangle(10,20);
        
        System.out.println(r2.display());
    }
    
}
