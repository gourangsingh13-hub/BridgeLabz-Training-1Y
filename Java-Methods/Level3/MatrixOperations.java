import java.util.Random;

public class MatrixOperations {

    public static int[][] createMatrix(int r,int c){
        Random rand = new Random();
        int[][] m = new int[r][c];
        for(int i=0;i<r;i++)
            for(int j=0;j<c;j++)
                m[i][j] = rand.nextInt(10);
        return m;
    }

    public static int[][] add(int[][] a,int[][] b){
        int r=a.length, c=a[0].length;
        int[][] res=new int[r][c];
        for(int i=0;i<r;i++)
            for(int j=0;j<c;j++)
                res[i][j]=a[i][j]+b[i][j];
        return res;
    }

    public static int[][] multiply(int[][] a,int[][] b){
        int r=a.length, c=b[0].length;
        int[][] res=new int[r][c];
        for(int i=0;i<r;i++)
            for(int j=0;j<c;j++)
                for(int k=0;k<b.length;k++)
                    res[i][j]+=a[i][k]*b[k][j];
        return res;
    }

    public static void display(int[][] m){
        for(int[] row:m){
            for(int val:row)
                System.out.print(val+" ");
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args){
        int[][] A=createMatrix(2,2);
        int[][] B=createMatrix(2,2);

        System.out.println("Matrix A:");
        display(A);
        System.out.println("Matrix B:");
        display(B);

        System.out.println("Addition:");
        display(add(A,B));

        System.out.println("Multiplication:");
        display(multiply(A,B));
    }
}