public class Exercise7 {
    //Write an application that will take a positive number from the user (type int) and
    //calculate the Fibonacci number at the indicated index. For example, if the number equals
    //5, your program should print the fifth Fibonacci number. In Fibonacci sequence, each
    //number is the sum of the two preceding ones. For example, the first few Fibonacci
    //numbers are:
    //1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377...
         public static void main(String[] args) {
             int n = 5;
             //Fn=(n-1)+(n-2);
             int f[] = new int[n+1];
             f[0]=0;
             f[1]=1;
             for(int i =2;i<=n;i++){
                 f[i]=f[i-1]+f[i-2];
                 System.out.println(n);
             }


    }
}
