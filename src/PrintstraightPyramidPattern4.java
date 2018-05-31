import java.util.Scanner;

public class PrintstraightPyramidPattern4 {
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
            for(int k=rowcount;k<=(2*rowcount);k++)
                System.out.print(rowcount);
            System.out.println();
            rowcount++;

        }

    }
}
