import java.util.Scanner;

public class Day5_CoinFlip{
	
	public static  void main(String [] args){
		//Creating object of scanner class	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of times to flip coin: ");
		int noOfTimesCoinFlip = sc.nextInt();
		if(noOfTimesCoinFlip > 0){
			double probabilityConstant = 0.5;
			int countOfTails = 0;
			int countOfHeads = 0;
			int i=1;
			while(i<=noOfTimesCoinFlip){
				double randomNumber = Math.random()*1;
				if( randomNumber < probabilityConstant){
					countOfTails++ ;
				}
				else{
					countOfHeads++ ;
				}
				i++;
			}
			float percentageOfHead = (float)(countOfHeads*100)/noOfTimesCoinFlip;
			float percentageOfTail = (float)(countOfTails*100)/noOfTimesCoinFlip;
			System.out.println(String.format("Percentage of Heads :%.0f%%",percentageOfHead));
			System.out.println(String.format("Percentage of Tails :%.0f%%",percentageOfTail));
			sc.close();
		}
		else{
			System.out.println("Please enter positive number!");
		}
	}
}