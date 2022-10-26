import java.util.Scanner;

public class Exercise12 {
    //Write an application that reads a text from the user (type String) and counts a percentage
    //of occurrences of a space character.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        //Ana are mere +> am 2 spatii
       // nr_spatii*100/12
        int nrOfSpaces= 0;
        for(int i = 0; i< text.length(); i++) {
            if(text.charAt(i)==' ') {
                nrOfSpaces ++;
            }
        }
        System.out.println("Procentul de spatii este de "+(nrOfSpaces*100d)/text.length()+"%");
    }
}
