class A
{
    int i, j;
    void showij()
    {
        System.out.println("i and j" +i+ " "+j);
    }
}
class B extends A
{
    int k;
    void showk()
    {
        System.out.println("k"+k);
    }
    void sum()
    {
        System.out.println("i+j+k"+(i+j+k));
    }
}
public class Single 
{
    public static void main(String[] args) {
        A superob = new A();
        B subob = new B();

        superob.i=10;
        superob.j=20;
        System.out.println("contents of super ob");
        superob.showij();
        System.out.println();
        /*the subclass has access to all public member of it superclass */

        subob.i=7;
        subob.j=8;
        subob.k=9;
        System.out.println("contents of subob");
        subob.showij();
        subob.showk();
        System.out.println();
        System.out.println("sum of i,j and k in subob");
    }    
}
