package DAY5_UseCases;
import java.util.Scanner;

public class Day5_PrimeFactorsOfNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int N = sc.nextInt();
        sc.close();
        int i = 2;
        while ((i*i) < N) {
            if(N % i == 0){
                System.out.println(i);
                N = N / i;
            }else{
                i++;
            }
        }
    }
}
