import java.util.*;

class height{
    public static void main(String[]args){
	
    Scanner sc=new Scanner(System.in);
        double h1,h2,h3;
        System.out.println("Enter height in centimeters :");
        h1=sc.nextDouble();
        h2=h1/2.54;//height in feet
        h3=h1/12.0;//height in inches
        System.out.println("Your Height in cm is "+h1+" while in feet is "+h2+" and inches is "+h3);
    }
}