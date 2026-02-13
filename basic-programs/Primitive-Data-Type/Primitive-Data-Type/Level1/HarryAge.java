import java.util.*;

class HarryAge{
    public static void main(String[] args){

        int birthYear = 2000;
        Scanner sc=new Scanner(System.in);
		System.out.print("current year: ");
		int currentYear = sc.nextInt();
	
	    int age = currentYear - birthYear ;
		System.out.println("Harry's age in " +currentYear+ " is " +age);
	}
}