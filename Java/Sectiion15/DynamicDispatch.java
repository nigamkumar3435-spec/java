class Super
{
    public void meth1()
    {
        System.out.println("Super method1");
    }
    public void meth2()
    {
        System.out.println("Super method2");
    }
}
class Sub extends Super
{
    @Override
    public void meth2()
    {
        System.out.println("Sub method2");
    }
    public void meth3()
    {
        System.out.println("Sub method3");
    }
}
public class DynamicDispatch 
{
    public static void main(String[] args) 
    {
        Super s=new Sub();
        s.meth1();  // -->Super method1
        s.meth2();  // -->Sub method2
        
//        Super s1=new Super();
//        s1.meth1();  // -->Super method1
//        s1.meth2();  // -->Super method2
//        
//        Sub s2=new Sub();
//        s2.meth1();  // -->Super method1
//        s2.meth2();  // -->Sub method2
//        s2.meth3();  // -->Sub method3
    }   
}
