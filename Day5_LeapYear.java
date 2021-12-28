import java.util.Scanner;
public class Day5_LeapYear{
	public static void main(String [] args){
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter Year: ");
	int userYear = sc.nextInt();
	
		if(userYear>1000 && userYear<9999){
			if((userYear%4 == 0) && (userYear%100 != 0) || (userYear%400 == 0)  ){
				System.out.println(userYear+" is LeapYear ");
			}
			else{
				System.out.println(userYear+" is not LeapYear ");
			}
 		}
		else{
			System.out.println("Invalid Input!");
		}
		sc.close();
	}
}