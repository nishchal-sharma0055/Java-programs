class Box
{
    private double width;
    private double height;
    private double depth;

    Box(double w, double h, double d)
    {
        width=w; 
        height=h;
        depth=d;
    }
    double volume()
    {
        return width*height*depth;
    }
}
class Boxweight extends Box
{
    double weight;
    Boxweight(double w, double h, double d, double m)
    {
        super(w,h,d);
        weight=m;
    }
}
class shipment extends Boxweight
{
    double cost;
    shipment(double w, double h, double d, double m, double c)
    {
        super(w,h,d,m);
        cost=c;
    }
}
public class Multileveliinheritance {
    public static void main(String[] args) {
        shipment shipment1 = new shipment(10, 20, 15, 10, 3.4);
        shipment shipment2 = new shipment(2, 3, 4, 0.76, 1.28);

        double volume;
        volume = shipment1.volume();

        System.out.println("volume of shipment 1 is "+volume);
        System.out.println("weight of shipment 1 is"+shipment1.weight);

        System.out.println("shipping cost $"+ shipment1.cost);
        System.out.println();

        volume= shipment2.volume();
        System.out.println("volume of shipment 2 is "+ volume);

        System.out.println("weight of shipment 2 is"+ shipment2.weight);
        System.out.println("shipping cost $"+shipment2.cost);
    }
}
