class Overloading
{
    public int max(int a , int b)
    {
        return a>b?a:b;
    }
    public int max(int a, int b, int c)
    {
        if(a>b && a>c) return a;
        else if(b>c) return b;
        return c;
    }
}
public class Polymorphism1 
{
    public static void main(String[] args) 
    {
        Overloading o1=new Overloading();
        System.out.println(o1.max(10,5));
        System.out.println(o1.max(10,12,6));
    }    
}
