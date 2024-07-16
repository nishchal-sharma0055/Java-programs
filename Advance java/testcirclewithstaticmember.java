class Circlewithstaticmembers 
{
    double radius;
    static int numberofobjects =0;  
    Circlewithstaticmembers()
    {
        radius=1;
        numberofobjects++;
    }
    Circlewithstaticmembers(double newRadius)
    {
        radius = newRadius;
        numberofobjects++;
    }
    static int getnumberofobjects()
    {
        return numberofobjects;
    }
    double getarea()
    {
        return radius*radius*Math.PI;
    }
}
public class testcirclewithstaticmember 
{
    public static void main(String[] args) 
    {
        System.out.println("before creating objects");
        System.out.println("The number of circle objects is" +Circlewithstaticmembers.numberofobjects);
        Circlewithstaticmembers C1 = new Circlewithstaticmembers();
        
        System.out.println("After creating C1");
        System.out.println("C1: radius ("+ C1.radius+") and number of circle objects("+ C1.numberofobjects +")");

        Circlewithstaticmembers C2 = new Circlewithstaticmembers(5);
        C1.radius =9;

        System.out.println("\n After creating C2 and modifying C1");
        System.out.println("C1: radius ("+C1.numberofobjects +")");

        System.out.println("C2: radius("+C2.radius+")and numnber of objects ("+C2.numberofobjects +")");
    }
}
