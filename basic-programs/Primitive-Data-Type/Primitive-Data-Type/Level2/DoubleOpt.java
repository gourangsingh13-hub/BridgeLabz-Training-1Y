import java.util.Scanner;

class DoubleOpt{
    public static void main(String[]args){
	
        Scanner sc=new Scanner(System.in);
        Double a,b,c;
		System.out.println("Enter three numbers :");
        a=sc.nextDouble();
        b=sc.nextDouble();
        c=sc.nextDouble();
		
        int r1,r2,r3,r4;
        r1=a+b*c;
        r2=a*b+c;
        r3=c+a/b;
        r4=a%b+c;
        System.out.println("The results of Double Operations are : "
		+r1+","+r2+","+r3+" and "+r4);
    }
}