package Section13;

public class Sum 
{
    static int sum(int ...a)
    {
        int s=0;
        for(int i=0;i<a.length;i++)
        {
            s=s+a[i];
        }
        return s;
    }     
    public static void main(String args[])
    {
        System.out.println(sum());
        int x[]={2,34,6,18,10};
        System.out.println(sum(x));
        System.out.println(sum(10));
        System.out.println(sum(10,20,30));
        System.out.println(sum(10,20,30,40,2,45,7));
    }
}
