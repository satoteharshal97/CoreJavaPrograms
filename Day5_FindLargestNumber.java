import java.util.Scanner;
public class Day5_FindLargestNumber{
	
	public static void main(String [] args){
		
		int largestNumber;
		Scanner sc = new Scanner(System.in);
		//Taking User Inputs
		System.out.print("Enter first number: ");
		int firstNumber = sc.nextInt();
		System.out.print("Enter second number: ");
		int secondNumber = sc.nextInt(); 
		System.out.print("Enter third number: ");
		int thirdNumber = sc.nextInt();
		//Closing Scanner Class
		sc.close();
		//Finding largest number using ternary operator
		largestNumber = (firstNumber>secondNumber?firstNumber:secondNumber)>thirdNumber?(firstNumber>secondNumber?firstNumber:secondNumber):thirdNumber ;
		System.out.print("Largest number :"+largestNumber);
		}
	}