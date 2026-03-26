public class IncreasArrSize {
    public static void main(String args[])
    {
        int a[]={1,2,3,4,5};
        int b[]=new int[10];

        for(int x:a)
            System.out.print(x+",");

        System.out.println(" ");
        System.out.println(a.length);

        for(int i=0;i<a.length;i++)
            b[i]=a[i];

        for(int x:b)
            System.out.print(x+",");
        System.out.println(" ");

        a=b;
        b=null;

        System.out.println(b);
        
        for(int x:a)
            System.out.print(x+",");
        System.out.println(" ");        
        
        System.out.println(a.length);
    }
}
