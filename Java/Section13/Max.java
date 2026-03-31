package Section13;

public class Max 
{
    static int max(int ...x)
    {
        if(x.length==0)
            return Integer.MIN_VALUE;

        int m=x[0];
        for(int i=1;i<x.length;i++)
        {
            if(m<x[i])
            {
                m=x[i];
            }
            
        }return m;
    }  

    public static void main(String args[])
    {
        System.out.println(max());
        int x[]={2,34,6,18,10};
        System.out.println(max(x));
        System.out.println(max(10));
        System.out.println(max(10,20,30));
        System.out.println(max(10,20,30,40,2,45,7));
    }
}
