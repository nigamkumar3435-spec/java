package Section13;

public class Overloading1 
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

    static int[] reverse(int a[])
    {
        int b[]=new int[a.length];

        for(int i=a.length-1,j=0;i>=0;i--,j++)
        {
            b[j]=a[i];

        }
        return b;
    }  
    public static void main(String args[])
    {
         System.out.println(reverse(876));
         
        int a[]={1,2,3,4,5,6,7};

        int result[]=reverse(a);

        for(int i=0;i<result.length;i++)
        {
            System.out.print(result[i]+" ");
        }
        
    }   
}
