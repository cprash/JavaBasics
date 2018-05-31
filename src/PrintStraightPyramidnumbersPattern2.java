import java.util.Scanner;

public class PrintStraightPyramidnumbersPattern2 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter number of rows");
        int n=scanner.nextInt();
        System.out.println(n);
        int rowcount=1;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=(n-i);j++)
                System.out.print(" ");
            for(int k=1;k<=rowcount;k++)
                System.out.print(k+" ");
            System.out.println();
            rowcount++;

        }

    }
}
