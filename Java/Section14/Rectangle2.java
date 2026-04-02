class Rectangle
{
    private int length;
    private int breadth;
    
    public int getLength()
    {
        return length;
    }
    public void setLength(int l)
    {
        if(l>0)
            length=l;
        else
            length=0;
    }
    public int getBreadth()
    {
        return breadth;
    }
    public void setBreadth(int b)
    {
        if(b>0)
            breadth=b;
        else
            breadth=0;
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
public class Rectangle2 
{

    public static void main(String[] args) 
    {
        Rectangle r=new Rectangle();
        r.setLength(10);
        r.setBreadth(15);
        
        System.out.println("Area: "+r.area());
        System.out.println("Perimeter: "+r.perimeter());
        System.out.println("Length: "+r.getLength());
        System.out.println("Breadth: "+r.getBreadth());
    }
    
}