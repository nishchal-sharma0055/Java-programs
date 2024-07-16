class animal
{
    String color="white";
}
class Dog extends animal
{
    String color="black";
    void Printcolor()
    {
        System.out.println(color);
        System.out.println(super.color);
    }
}
public class testsuper {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.Printcolor();
    }
}
