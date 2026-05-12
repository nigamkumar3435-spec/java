class Outer
{
    int x=10;
    class Inner
    {
        int y=20;
        void innerDisplay()
        {
            System.out.println(x);
            System.out.println(y);
        }
    }
    void outerDisplay()
    {
        Inner i=new Inner();
        i.innerDisplay();
        System.out.println(i.y);
    }
}
public class InnerClass 
{
    public static void main(String[] args) 
    {
        Outer o=new Outer();
        o.outerDisplay();
        Outer.Inner i=new Outer().new Inner();
    }  
}
// Inner class can access the member of outer class directly.but outer class can't access member of inner class directly unless it has created an object of inner class.
