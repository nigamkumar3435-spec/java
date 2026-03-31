package Section13;

public class VarArgument 
{
    static void show(int ...a)
    {
        for(int x:a)
        {
            System.out.println(x);
        }
    }   

    static void showList(String ...S)
    {
        for(int i=0;i<S.length;i++)
        {
            System.out.println(i+1+". "+S[i]);
        }
    }

    static void showList(int start,String ...S)
    {
        for(int i=0;i<S.length;i++)
        {
            System.out.println(start+". "+S[i]);
            start++;
        }
    }
    public static void main(String args[])
    {
        show();
        show(12,32,44);
        show(new int[]{9,8,7,6,5});

        showList("John","Smith","Arjun","Hari");
        showList(5,"John","Smith","Arjun","Hari");
    }
}
