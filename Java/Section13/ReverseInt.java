package Section13;

public class ReverseInt 
{
    static int reverse(int a)
    {
        int rev=0;
        while(a>0)
        {
            rev=rev*10+a%10;
            a=a/10;
        }
        return rev; 
    }   

    public static void main(String args[])
    {
        System.out.println(reverse(876));
    }
}
