class Cylinder
{
    private double radius;
    private double height;
    
    public Cylinder()
    {
        radius=6;
        height=7;
    }
    public Cylinder(double r,double h)
    {
        radius=r;
        height=h;
    }
    
   public double getRadius()
   {
       return radius;
   }
   public void setRadius(double r)
   {
       if(r>0) radius=r;
       else radius=0;
   }
   public double getHeight()
   {
       return radius;
   }
   public void setHeight(double h)
   {
       if(h>0) height=h;
       else height=0;
   }
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
public class Cylinder2 
{   
    public static void main(String[] args) 
    {
        Cylinder c=new Cylinder();
        System.out.println("Volume: "+c.volume());
        System.out.println("Common Surface Area: "+c.csa());
        System.out.println("Lid Area: "+c.lidArea());
    }
    
}
