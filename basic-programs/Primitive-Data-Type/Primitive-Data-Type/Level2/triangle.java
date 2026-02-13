import java.util.*;

class triangle{
    public static void main(String[]args){
	
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter base and height in centimeters :");
        double base=sc.nextDouble()height=sc.nextDouble();
        double area_cm=0.5*base*height;
        double area_inches=area_cm/6.4516;
        System.out.println("The Area of the triangle in sq in is "
		+area_inches+" and sq cm is "+area_cm);
    }
}