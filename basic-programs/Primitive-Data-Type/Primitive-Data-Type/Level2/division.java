import java.util.*;

class division{
    public static void main(String[]args){
	
        Scanner sc=new Scanner(System.in);
        int number1,number2;
        System.out.println("Enter two numbers :");
        number1=sc.nextInt();
        number2=sc.nextInt();
		
        int quotient,remainder;
        quotient=number1/number2;
        remainder=number1%number2;
        System.out.println("The Quotient is "+quotient+
		" and Remainder is "+remainder+" of two numbers "+number1+" and "+number2);
    }
}