import java.util.*;

class ProfitLoss{
    public static void main(String[] args){
	
	int costPrice = 129;
	int sellPrice = 191;
	int profit = sellPrice - costPrice;
	double profitPercentage = (profit/ (double) costPrice)*100;
	
	System.out.println("The cost price is INR " + costPrice +
	" and selling price is INR " + sellPrice + "\n" +
	"The profit is INR " + profit +
	" and the profit percentage is INR "
	+ profitPercentage);
	}
}	