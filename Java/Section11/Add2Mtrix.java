public class Add2Mtrix {
    public static void main(String args[])
    {
        int a[][]={{1,2,3},{2,4,6},{3,6,9}};
        int b[][]={{1,2,3},{2,4,6},{3,6,9}};
        int c[][]=new int[3][3];

        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                c[i][j]=a[i][j]+b[i][j];
                System.out.print(c[i][j]+" ");
            }
            System.out.println("");
        }

        System.out.println("------------------");

        for(int x[]:c)
        {
            for(int y:x)
            { 
                System.out.print(y+" ");
            }
            System.out.println("");
        }
            
    }
}
