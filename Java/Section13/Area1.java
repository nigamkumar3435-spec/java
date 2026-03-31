package Section13;

public class Area1 
{
    static int area(int x)
    {
        int z=x*x;
        return z;
    }
    static int area(int x, int y)
    {
        int z=x*y;
        return z;
    }
    static double area(double r)
    {
        double a=3.14*r*r;
        return a;
    }

    public static void main(String args[])
    {
        System.out.println(area(4));
        System.out.println(area(4,4));
        System.out.println(area(4.0));
    }
}
