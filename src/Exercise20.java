import java.util.Scanner;

public class Exercise20 {
    public static void main(String[] args) {
        double randomNumber = Math.random();
        int randomInt = (int) (randomNumber * 100);
        Scanner scanner = new Scanner(System.in);
   int numar = 0;
   do{
            numar= scanner.nextInt();
           if(numar>randomInt){
               System.out.println("too much");
           }
               else if(numar<randomInt){
                   System.out.println("not enough");
               }
               else{
                   System.out.println("congrats!");
               }
        }while(numar!=randomInt);
    }
}
