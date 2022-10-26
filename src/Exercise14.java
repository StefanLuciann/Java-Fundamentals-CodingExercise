import java.util.Scanner;

public class Exercise14 {
    //Write an application that reads two lowercase letters of the Latin alphabet (type char)
    //and calculates how many characters is there in the alphabet between given letters.
    //Hint - use the ASCII code table and treat the characters as int numbers.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text1 = scanner.nextLine();
        String text2 = scanner.nextLine();
        char char1 = text1.charAt(0);
        char char2 = text2.charAt(0);
        System.out.println(char2-char1-1);

    }
}
