public class StringPractice
{
  public static void main(String[] args)
  {
    // String str1="Java";
    // System.out.println(str1);

    // String str2=new String("JAVA");
    // System.out.println(str2);

    // char c[]={'H','E','L','L','O'};
    // String str3=new String(c);
    // System.out.println(str3);

    //byte b[]={71,69,69,75,83};
    // String str4=new String(b);
    // System.out.println(str4);
   
    // byte b[]={65,66,67,68,69};
    // String str4=new String(b,1,3);
    // System.out.println(str4);

    String str5="Java";//this java referring to a pool 
    //String str6="JAVA";
    String str6=new String("Java");//this java referring to a heap
    System.out.println(str5==str6);
  }
}
