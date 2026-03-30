package Section13;

public class MaxElement 
{
    static int max(int a[])
    {
        int max=a[0];

        for(int i=0;i<a.length;i++)
        {
            if(a[i]>max)
            {
                max=a[i];
            }
        }
        return max;
    }
    public static void main(String args[])
    {
        int a[]={6,5,3,34,65,8};

        System.out.println(max(a));
    }
}
