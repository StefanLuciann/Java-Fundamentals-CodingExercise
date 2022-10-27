import java.util.ArrayList;

public class AlgExtra1 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(10);
        numbers.add(9);
        numbers.add(1);
        int sum = 0;
        //Se da o lista de numere
        //Trebuie sa adunam toate nr din lista
        //Insa sa le adunam numai pe acelea care sunt mai mari decat toate nr din dreapta
        for(int i = 0;i<numbers.size()-1;i++){
            boolean toBeAdded = true;
            for(int j = i ;j <numbers.size();j++){
                if(numbers.get(i)< numbers.get(j)) {
                    toBeAdded = false;
                }
            }
            if(toBeAdded ){
                sum=sum+numbers.get(i);
            }
        }
        System.out.println(sum);
    }
}
