import java.util.Scanner;

class distance_conversion{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter distance in feet :");
        double d1=sc.nextDouble();
        double d2,d3;
        d2=d1/3;
        d3=d2/1760;
        System.out.println("The distance in yards is "+d2+" while the distance in miles is "+d3);
    }
}