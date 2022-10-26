import java.util.ArrayList;
import java.util.Scanner;

public class Exercise11 {
    //Write an application that will read texts (variables of the String type) until the user gives
    //the text "Enough!" and then writes the longest of the given texts (not including the text
    //"Enough!"). If the user does not provide any text, write "No text provided".
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String>inputs= new ArrayList<>();
        String x;
      do{
           x = scanner.next();
          inputs.add(x);
      }while(!x.equals("Enough!"));
      if(inputs.size()==1){
            System.out.println("No text provided");
        }
      String longest = inputs.get(0);
      for(int i = 0;i<inputs.size()-1;i++){
          if(longest.length()<inputs.get(i).length()){
              longest=inputs.get(i);
          }
      }
        System.out.println(longest);
    }
}
