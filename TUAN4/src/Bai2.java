import java.util.Scanner;

public class Bai2 
{
    public static void main(String[] args) 
    {
        for(int i=1 ; i<=10;i++)
        {
            for(int j=1;j<=10;j++)
                System.out.print(j+" * "+i+" = "+j*i+" ");
            System.out.print("\n");
        }
    }
}
