import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercise15 {
    //Write an application that reads from the user 10 arbitrarily large numbers (variables of
    //type int) and prints those that occurred at least twice.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> nrs = new ArrayList<>();
        for(int i = 0 ;i<10;i++) {
            nrs.add(scanner.nextInt());
        }
        ArrayList<Integer> foundtwice = new ArrayList<>();
        for(int i =0;i<nrs.size();i++){
            for(int j=0;j<nrs.size();j++){
                if(i!=j&& nrs.get(i)==nrs.get(j)){
                   if(!foundtwice.contains(nrs.get(i))){
                       foundtwice.add(nrs.get(i));
                   }
                }
            }

        }
        System.out.println(foundtwice);

    }
}
