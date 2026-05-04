class Phone
{
    public void call()
    {
        System.out.println("Phone Call");
    }
    public void sms()
    {
        System.out.println("Phone Sending SMS");
    }
}
interface ICamera
{
    void click();
    void record();
}
interface IMusicPlayer
{
    void play();
    void stop();
}
class SmartPhone extends Phone implements ICamera,IMusicPlayer
{
    public void videoCall()
    {
        System.out.println("Smart Phone video Calling");
    }
    public void click()
    {
        System.out.println("Smart Phone CLicking Photo");
    }
    public void record()
    {
        System.out.println("Smart Phone recording video");
    }
    public void play()
    {
        System.out.println("Smart Phone playing music");
    }
    public void stop()
    {
        System.out.println("Smart Phone stopped playing music");
    }
}
public class InterfacePractice2 
{
    public static void main(String[] args) 
    {
        ICamera sp=new SmartPhone();
        sp.click();
        sp.record();
    }    
}
