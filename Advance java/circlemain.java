class Circle
{
    double x, y;
    double r;
    Circle(double x, double y, double r)
    {
        this.x=x; this.y=y; this.r=r;
    }
    Circle(double r)
    {
        x=0; y=0; this.r=r;
    }
    Circle(Circle C)
    {
        x=C.x; y=C.y; r=C.r;
    }
    Circle()
    {
        x=0.0; y=0.0; r=1.0;
    }
    double circumfrence()
    {
        return 2*3.14159*r;
    }
    double area()
    {
        return(22/7)*r*r;
    }
}
class circlemain
{
    public static void main(String[] args) {
        Circle C1 = new Circle(3.0, 4.0, 5.0);
        Circle C2 = new Circle(5.0);
        Circle C3 = new Circle(C1);
        Circle C4 = new Circle();
        System.out.println("circumfrence circle 1"+ C1.circumfrence());
        System.out.println("area circle1" +C1.area());
        System.out.println("area circle2" + C2.area());
    }
}