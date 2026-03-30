package Section13;

public class Overloading 
{
    static int max(int x, int y)
    {
        return x>y?x:y;
    }   
    static float max(float x, float y)
    {
        return x>y?x:y;
    }
    static int max(int x, int y, int z)
    {
        return x>y && x>z?x:(y>z?y:z);
    }

    public static void main(String args[])
    {
        System.out.println(max(10,14));
        System.out.println(max(4,7,3));
        System.out.println(max(7.4f,8.4f));
    }
}
