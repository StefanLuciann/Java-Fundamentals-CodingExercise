import java.util.Scanner;

public class Exercise6 {
    //Write an application that takes a number n from the user (type int) and calculates the
    //sum of the harmonic series from 1 to n, according to the formula below:


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double sum = 0;
        for (int i = 1; i < n; i++) {
            sum = sum + 1d/ i;
        }
            System.out.println( sum);

        }
    }


