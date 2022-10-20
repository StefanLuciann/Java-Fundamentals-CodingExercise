import java.util.Scanner;

public class Exercise2 {
    //Write an application calculating BMI (Body Mass Index) and checking if it’s optimal or not.
    //Your application should read two variables: weight (in kilograms, type float) and height
    //(in centimeters, type int). BMI should be calculated given following formula:
    //The optimal BMI range is from 18.5 to 24.9, smaller or larger values are non-optimal
    //values. Your program should write "BMI optimal" or "BMI not optimal", according to the
    //assumptions above.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti greutatea :");
        float weightInKg = scanner.nextFloat();
        System.out.println("Introduceti inaltimea :");
        int heightInCm = scanner.nextInt();
        float heightInM = (float) (heightInCm) / 100;
        double Bmi = weightInKg / Math.pow(heightInM, 2);
        if (Bmi > 18.5 && Bmi < 24.9) {
            System.out.println("BMI optimal");
        } else {
            System.out.println("BMI not optimal");
        }
    }
}
