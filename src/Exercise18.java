import java.util.Scanner;
//Write an application that reads a text from the user (type String) and checks whether the
//user sneezed, i.e. whether the text equals ‘achooo!’ with one or more letter "o" at the end
//of the expression (so both 'acho!' and 'achooooooo!’ are correct). Hint: use a regular
//expression with the appropriate quantifier.
public class Exercise18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
       if(text.startsWith("acho")&&text.endsWith("!")){
           System.out.println(true);
        }
       else{
           System.out.println(false);
       }
    }
}
