import java.util.Scanner;

class student_fee_2{
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        double fee,discountPercent,discount,discounted_fee;
        System.out.println("Enter fee and discountPercent :");
		
        fee=sc.nextDouble();
        discountPercent=sc.nextDouble();
        discount=(fee*discountPercent)/100;
        discounted_fee=fee-discount;
		
        System.out.println("The discount amount INR "+discount+
		" and final discounted fee is INR "+discounted_fee);
    }
}