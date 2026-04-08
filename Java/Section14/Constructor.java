class Rectangle
{
    private double length;
    private double breadth;
    
    public Rectangle()
    {
        length=6;
        breadth=7;
    }
    public Rectangle(double l,double b)
    {
        length=l;
        breadth=b;
    }
    public Rectangle(double s)
    {
        length=breadth=s;
    }
    public double area()
    {
        return length*breadth;
    }
    public double perimeter()
    {
        return 2*(length+breadth);
    }
}
public class Constructor 
{

    public static void main(String[] args) 
    {
        Rectangle r=new Rectangle();
        
        System.out.println("Area:"+r.area());
        System.out.println("Perimeter :"+r.perimeter());
        
    }
    
}
