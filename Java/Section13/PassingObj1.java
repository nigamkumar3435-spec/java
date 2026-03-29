package Section13;

public class PassingObj1 {

    static void update(int a[])
    {
        a[0]=25;
    }
    
    public static void main(String args[])
    {
        int a[]={1,2,3,4,5};
        System.out.println(a[0]);
        update(a);
        System.out.println(a[0]);
    }
}
