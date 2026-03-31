package Section13;

public class ReverseArray 
{
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
        int a[]={1,2,3,4,5,6,7};

        int result[]=reverse(a);

        for(int i=0;i<result.length;i++)
        {
            System.out.print(result[i]+" ");
        }
        
    }
}
