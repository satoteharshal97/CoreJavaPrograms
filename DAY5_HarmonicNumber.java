package DAY5_UseCases;

import java.util.Scanner;
public class DAY5_HarmonicNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter nth position to find nth harmonic number: ");
        int N = sc.nextInt();
        int i;
        double harmonicNumber = 0;
        if (N != 0) {
            for (i = N; i > 0; i--) {
                harmonicNumber +=  (double)1 /  i;
            }
            System.out.println(harmonicNumber);
        } else {
            System.out.println("Enter Positive Integer ");
        }
    }
}
