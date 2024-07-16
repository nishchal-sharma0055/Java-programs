import java.util.Scanner;
public class passtwodimensionalarray {
    public static void main(String[] args) {
        int [][] m = getarray();
        //display sum of elements
        System.out.println("sum of all elements is"+sum(m));
    }    
    public static int [][] getarray()
    {
        Scanner input = new Scanner(System.in);
        //enter arry values
        int [][] m = new int[3][4];
        System.out.println("enter"+ m.length+ "rows and"+ m[0].length+"column");
        for(int i=0; i<m.length; i++)
        for(int j=0; j<m[i].length; j++)
        m[i][j] = input.nextInt();
        return m;
    }
    public static int sum(int [][]m)
    {
        int total=0;
        for(int row=0; row<m.length; row++)
        {
            for(int column=0; column<m[row].length; column++)
            {
                total+=m[row][column];
            }
        }
        return total;
    }
}
