public class Array2D {
    public static void main(String args[])
    {
        int b[][]=new int[3][4];
        int a[][]={{1,2,3,4},{5,6,7,8},{9,8,7,6}};
        // for(int i=0;i<a.length;i++)
        // {
        //     for(int j=0;j<a[0].length;j++)
        //     {
        //         System.out.print(a[i][j]+" ");
        //     }
        //     System.out.println("");
        // }

        // Using for each loop

        // for(int x[]:a)
        // {
        //     for(int y:x)
        //         System.out.print(y+" ");
        //     System.out.println(" ");
        // }

        System.out.println(a);
        System.out.println(a.length);
        System.out.println(b);
        System.out.println(b.length);
    }
}
