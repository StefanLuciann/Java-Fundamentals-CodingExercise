import java.util.ArrayList;
import java.util.Scanner;
public class Exercitiul123123 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> nrs = new ArrayList<>();
        for (int i = 0;i<10;i++){
            nrs.add(scanner.nextInt());
        }
        //Sa afisam valoarea maxima
      int max = nrs.get(0);
        for(int i = 1; i<nrs.size();i++){
            if(max<nrs.get(i)){
                max=(nrs.get(i));
            }
        }
        System.out.println(max);
    }
}
