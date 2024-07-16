class Box
{
    double width;
    double height;
    double depth;
    Box()
    {
        width=0.0;
        height=0.0;
        depth=0.0;
    }
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
class Myclass
{
    public static void main(String [] args)
    {
        Box mybox1 = new Box();
        // Box Mybox2 = new Box();
        Boxweight mybox2 = new Boxweight(2,3,4,0.0076);
        double vol;
        vol = mybox1.volume();
        System.out.println("volume of Mybox1 is "+ vol);
        System.out.println();
        vol = mybox2.volume();
        System.out.println("volume of Mybox2 is "+ vol);
        System.out.println("weight of Mybox is "+ mybox2.weight);
    }
}