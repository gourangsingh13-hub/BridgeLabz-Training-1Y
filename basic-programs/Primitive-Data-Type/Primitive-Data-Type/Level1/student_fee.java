class student_fee{
    public static void main(String[]args){
	
        int fee=125000,discountPercent=10;
        double discount=(fee*discountPercent)/100;
        double discounted_fee = fee-discount;
        System.out.println("The discounted amount is INR "
		+discount+" and final discounted fee is INR "+discounted_fee);
    }
}