class cat
{
    void speak()
    {
        System.out.println("Meaon");
    }
}
class ATcat extends cat
{
    void speak()
    {
        System.out.println("Meow");
    }
}
class Magiccat extends cat
{
    boolean noone;
    void speak()
    {
        if(noone)
        {
            super.speak();
        }
        else
        {
            System.out.println("Hello world !");
        }
    }
}
public class testsuper3
{
    public static void main(String [] args)
    {
        ATcat C1 = new ATcat();
        Magiccat C2 = new Magiccat();
        C2.noone = true;
        C2.speak();
        C1.speak();
        C2.noone = false;
        C2.speak();
    }
}