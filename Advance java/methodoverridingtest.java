class Point2D
{
    int x;
    int y;
    Point2D(int a, int b)
    {
        x=a;
        y=b;
    }
    void display()
    {
        System.out.println("x="+x+ "y="+y);
    }
}
class Point3D extends Point2D
{
    int z;
    Point3D(int c)
    {
        super(0,0);
        z=c;
    }
    Point3D(int a, int b, int c)
    {
        super(a,b);
        z=c;
    }
    void display()
    {
        System.out.println("x="+x+ "y="+y+ "z="+z);
    }
}
public class methodoverridingtest 
{
    public static void main(String[] args) {
        Point2D p = new Point2D(3, 4);
        p.display();
        Point3D q = new Point3D(0);
        q.display();
    }
}
