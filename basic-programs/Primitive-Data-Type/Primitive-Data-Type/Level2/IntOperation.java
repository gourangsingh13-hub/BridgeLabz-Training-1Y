import java.util.*;

class IntOperation{
    public static void main(String[]args){
	
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter three numbers :");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
		
        int r1,r2,r3,r4;
        r1=a+b*c;
        r2=a*b+c;
        r3=c+a/b;
        r4=a%b+c;
        System.out.println("The results of Int Operations are : "
		+r1+","+r2+","+r3+" and "+r4);
    }
}