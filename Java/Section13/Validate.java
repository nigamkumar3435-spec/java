package Section13;

public class Validate 
{
    static boolean validate(String name)
    {
        return name.matches("[a-zA-Z\\s]*");
    }   

    static boolean validate(int age)
    {
        return age>=3 && age<=15;
    }

    public static void main(String args[])
    {
        System.out.println(validate("Nigam"));
        System.out.println(validate(12));
    }
}
