import java.util.Scanner;
public class Day5_SwapTwoNumbers{
	
	public static void main(String[] args) {  
		 
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first number: ");
		int firstNumber = sc.nextInt();
		System.out.print("Enter second number: ");
		int secondNumber = sc.nextInt(); 
		//Swapping Numbers
		firstNumber = firstNumber + secondNumber;  
		secondNumber = firstNumber - secondNumber;  
		firstNumber = firstNumber - secondNumber; 
		System.out.println("After Swapping"); 
		//After Swapping Numbers 
		System.out.println("Value of First Number:" + firstNumber);  
		System.out.println("Value of Second Number:" + secondNumber);
		sc.close();
	} 
	
}   