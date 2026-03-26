public class ReverseCopying {
    public static void main(String args[])
    {
        int a[]={1,2,3,4,5,6,7,8,9,10};
        int b[]=new int[10];

        for(int x:a)
            System.out.print(x+",");
        System.out.println(" ");

        for(int i=a.length-1,j=0;i>=0;i--,j++)
        {
                b[j]=a[i];
        }

        for(int x:b)
            System.out.print(x+",");
    }
}
