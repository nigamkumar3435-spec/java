package Section13;

public class Methods {
    static int max(int a, int b)
    {
        a++;
        if(a>b)
            return a;
        else
            return b;
    }

    public static void main (String args[])
    {
        int x=45;
        int y=56;
        int z;

        z=max(x,y);
        System.out.println(z);
    }
}
