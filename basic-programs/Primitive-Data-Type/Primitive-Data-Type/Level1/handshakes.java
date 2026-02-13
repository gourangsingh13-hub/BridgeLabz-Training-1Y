import java.util.Scanner;
class handshakes{
    public static void main(String[]args){

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of students :");
        int numberOfStudents=sc.nextInt();
        int numberOfHandshakes=(numberOfStudents*(numberOfStudents-1))/2;
        System.out.println("Maximum number of possible handshakes is "+numberOfHandshakes);
    }
}