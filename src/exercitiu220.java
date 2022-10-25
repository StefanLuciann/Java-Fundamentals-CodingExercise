import java.util.Scanner;

public class exercitiu220 {
    //https://codingbat.com/prob/p143825
    //Sa afisam concaternarea celor 2 texte ignorand primul caracter al fiecaruia
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text1 = scanner.nextLine();
        String text2 = scanner.nextLine();
        System.out.println( text1.substring(1,text1.length()) + text2.substring(1,text2.length()));
    }
}
