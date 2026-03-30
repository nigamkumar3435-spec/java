package Section13;

public class PassingPrimitive 
{
    static void change(int x, int value)
    {
        x=value;
    }

    public static void main(String args[])
    {
        int x=45;

        System.out.println("Value of primitive x before change: "+x);

        change(x,54);

        System.out.println("Value of primitive x after change: "+x);
    }
    
}
