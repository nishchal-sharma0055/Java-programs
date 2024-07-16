class animal
{
    void eat()
    {
        System.out.println("eating");
    }
}
    class Dog extends animal
    {
        void eat()
        {
            System.out.println("eating bread");
        }
        void bark()
        {
            System.out.println("barking");
        }
        void work()
        {
            super.eat();
            bark();
            eat();
        }
    }
public class testsuper2 {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.work();
    }
}
