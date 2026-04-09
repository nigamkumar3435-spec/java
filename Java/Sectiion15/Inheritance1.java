class Circle
{
    public double radius;
    
    public double area()
    {
        return Math.PI*radius*radius;
    }
    public double perimeter()
    {
        return Math.PI*2*radius;
    }
}
class Cylinder extends Circle
{
    public double height;
    
    public double volume()
    {
        return area()*height;
    }
}
public class Inheritance1 
{
    public static void main(String[] args) 
    {
       Cylinder c2=new Cylinder();
       
       c2.radius=5;
       c2.height=6;
       
       System.out.println("Area1:"+c2.area());
       System.out.println("Area2:"+c2.volume());
    }
    
}

