import java.util.Scanner;

class calculator {
    public static void main(String[] args) {
	
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        float number1 = sc.nextFloat();
        float number2 = sc.nextFloat();
        float add = number1 + number2;
        float sub = number1 - number2;
        float m = number1 * number2;
        float d = number1 / number2;
		
        System.out.println("The addition, subtraction, multiplication and division value of 2 numbers " + number1 + " and " + number2);
        System.out.println(" is "+add+", "+sub+", "+m+", and "+d);
        }
    }