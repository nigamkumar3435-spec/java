class Cylinder 
{
    public double radius;
    public double height;
    
    public double volume()
    {
        return Math.PI*radius*radius*height;
    }
    public double csa()
    {
        return 2*Math.PI*radius*height;
    }
    public double lidArea()
    {
        return Math.PI*radius*radius;
    }
}
public class Cylinder1 
{
    public static void main(String[] args) 
    {
        Cylinder c1=new Cylinder();
        
        c1.radius=7;
        c1.height=10;
        
        System.out.println("Volume: "+c1.volume());
        System.out.println("Common Surface Area: "+c1.csa());
        System.out.println("Lid Area: "+c1.lidArea());
    }    
}
