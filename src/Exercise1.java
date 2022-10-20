import java.util.Scanner;

public class Exercise1 {
    //Write an application that will read diameter of a circle (variable of type float) and
    //calculate perimeter of given circle.
    //Firstly, assume π = 3.14. Later, use value of π from built-in Math class.
    //P= πD
    //D= 2r

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float diametru = scanner.nextFloat();
         double Perimetru = Math.PI*diametru;
        System.out.println("Perimetrul este = " + Perimetru);
        System.out.println("Perimetrul este = " + Perimetru);
    }
}
