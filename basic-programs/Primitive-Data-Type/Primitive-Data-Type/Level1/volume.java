import java.util.*;

class volume{
    public static void main(String[]args){
	
        int r=6378;
        double v=(4.0/3.0)*Math.PI*r*r*r;
        System.out.println("The volume of earth in cubic kilometers is "
		+v+" and cubic miles is "+(v*0.6*0.6*0.6)); 
    }
}