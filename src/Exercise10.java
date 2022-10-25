import java.util.Scanner;

public class Exercise10 {
    //Write an application that gets one positive number (type int) from the user and calculates
    //a sum of digits of the given number. Hint: to make some operations on every single digit
    //of the number (digit by digit), you can calculate the remainder of dividing the number by
    //10 (to get the value of the last digit) and divide the number by 10 (to "move" to the next
    //digit).
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;
        while (n != 0) {
            sum = sum + n % 10;
            n = n / 10;
        }
        System.out.println(sum);
    }
}
