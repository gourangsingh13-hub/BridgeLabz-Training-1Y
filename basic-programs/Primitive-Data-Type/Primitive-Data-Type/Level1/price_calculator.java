import java.util.Scanner;

class price_calculator{
    public static void main(String[]args){
	
        Scanner sc=new Scanner(System.in);
        double unitPrice,total_price;
        int quantity;
        System.out.println("Enter unit price and quantity of the item :);]
        unitPrice=sc.nextDouble();
        quantity=sc.nextInt();
        total_price=unitPrice*quantity;
        System.out.println("The total purchase price is INR "
		+total_price+" if the quantity "+quantity+" and unit price is INR "+unitPrice);
    }
}