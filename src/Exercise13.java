import java.util.Scanner;

public class Exercise13 {
    //www.sdacademy.plwww.sdacademy.pl
    //Task 13.
    //Write an application that "stutters", that is, reads the user's text (type String), and prints
    //the given text, in which each word is printed twice.
    //For example, for the input: "This is my test" the application should print "This This is is
    //my my test test".
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
      String[] parts =text.split(" ");
        for(int i = 0 ;i< parts.length;i++){
            System.out.print(parts[i]+" "+ parts[i]+ " ");
        }

    }
}
