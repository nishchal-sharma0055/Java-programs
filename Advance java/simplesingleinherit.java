class Point2D
{
    int x;
    int y;
    void display()
    {
        System.out.println("x="+x+" y="+y);
    }
}
class Point3D extends Point2D    
{
    int z;
    void display()
    {
        System.out.println("x="+x+ "y="+y+ "z="+z);
    }
}
public class simplesingleinherit {
    public static void main(String[] args) {
        Point2D P1 = new Point2D();
        Point3D P2 = new Point3D();
        P1.x=10;
        P1.y=20;
        System.out.println("point2D P1 is");
        P1.display();
        //initalizing Point 3D
        P2.x=5;
        P2.y=6;
        P2.z=15;
        System.out.println("Point3D P2 is");
        P2.display();
    }    
}
