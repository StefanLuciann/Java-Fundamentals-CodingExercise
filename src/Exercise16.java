import java.util.ArrayList;
import java.util.Scanner;

public class Exercise16 {
    public static void main(String[] args) {
        ArrayList<Integer> nrs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        for(int i=0;i<10;i++){
            nrs.add(scanner.nextInt());

        }
     boolean suntemPeCrestere = false;
        int pozitieDeInceputACresterii =0;
        int max = 0;
        for(int i = 0;i<nrs.size();i++){
            if(nrs.get(i)< nrs.get(i+1)){
                if(!suntemPeCrestere){
                    pozitieDeInceputACresterii=i;
                }
                suntemPeCrestere = true;
           }else{
                suntemPeCrestere =false;
                int lungimeaSiruluiCrescator = i-pozitieDeInceputACresterii+1;
                if(max<lungimeaSiruluiCrescator){
                    max =lungimeaSiruluiCrescator;
                }
            }
        }
        System.out.println(max);
    }
}
