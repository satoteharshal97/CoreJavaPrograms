import java.util.Scanner;
public class Day5_CheckVowelConsonant{
	
	public static void main(String [] args){
		int charPosition = 0;
		Scanner sc = new Scanner(System.in);
		//Taking User Inputs
		System.out.print("Enter an Alphabet: ");
		char ch = sc.next().charAt(charPosition);
		//Closing Scanner Class
		sc.close();
		//Checking an alphabet is vowel or consonant
		if(ch == 'a' ||ch == 'e' ||ch == 'i' ||ch == 'o' ||ch == 'u' ||ch == 'A' ||ch == 'E' ||ch == 'I' ||ch == 'O' ||ch == 'U' ){
			System.out.println(ch+" is vowel");
		}else{
			System.out.println(ch+" is consonant");
		}
	}
}