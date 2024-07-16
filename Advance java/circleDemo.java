class circle
{
    double x,y;
    double r;
    double circumfrence()
    {
        return 2*3.14159*r;
    } 
    double area()
    {
        return(22.0/7.0)*r*r;
    }
}
public class circleDemo 
{
    public static void main(String[] args) {
        circle c = new circle();
        c.x = 0.0;
        c.y = 0.0;
        c.r =5.0;
        System.out.println("circumfrence" + c.circumfrence());
        System.out.println("Area" + c.area());
    }    
}
