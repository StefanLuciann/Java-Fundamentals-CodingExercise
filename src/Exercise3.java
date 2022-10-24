import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        //Task 3.
        //Write a program for solving a quadratic equation. The program should take three integers
        //(coefficients of the quadratic equation a, b, c) and calculate the roots of the
        //equation
        //If delta ∆ comes out negative, print "Delta negative" and exit the program.
        //Else solve x1 and x2
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        double delta = b*b-4*a*c;
        double x1 =(-b-Math.sqrt(delta))/(2*a);
        double x2 =(-b+Math.sqrt(delta))/(2*a);
        if(delta<0){
            System.out.println("Delta negative");
        }
      else{

            System.out.println(x1);
            System.out.println(x2);
        }
    }
}
