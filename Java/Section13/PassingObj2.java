package Section13;

public class PassingObj2 
{
    static void change(int a[],int index, int value)
    {
        a[index]=value;
    }
    public static void main(String args[])
    {
        int a[]={2,4,6,8};

        for(int x:a)
            System.out.print(x+",");
        System.out.println("");
        
        change(a,2,7);

        for(int x:a)
            System.out.print(x+",");

    }
}
