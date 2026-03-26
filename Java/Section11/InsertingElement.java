public class InsertingElement {
    public static void main(String args[])
    {
        int a[]=new int[10];
        a[0]=3;a[1]=4;a[2]=6;a[3]=9;a[4]=1;
        for(int x:a)
            System.out.print(x+",");

        System.out.println("");

        int m=10;
        int index=2;

        for (int i=a.length-1;i>index;i--)
        {
            a[i]=a[i-1];   
        }
        a[index]=m;
        for(int x:a)
            System.out.print(x+",");

    }
}
