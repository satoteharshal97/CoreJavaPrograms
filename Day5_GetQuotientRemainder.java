import java.util.Scanner;
public class Day5_GetQuotientRemainder{
	
	public static void main(String [] args){
		//Variables
		int userNumber ,numberDivisor;
		float numberQuotient = 0;
		float numberRemainder = 0; 
		//User Inputs
		System.out.print("Enter a number:");
		Scanner sc = new Scanner(System.in);
		userNumber = sc.nextInt();
		System.out.print("Enter a number to divide by User Number:");
		numberDivisor = sc.nextInt();
		sc.close();
		//Print Quotient And Remainder
		numberQuotient = (float)userNumber / numberDivisor ;
		System.out.printf("Quotient of number:%.2f",numberQuotient);
		numberRemainder = (float)userNumber % numberDivisor ;
		System.out.printf("\nRemainder of number:%.2f",numberRemainder);
		
	}
}