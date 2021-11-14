package Conditions;
import java.util.Scanner;
public class FibonacciApp {
    public static void main(String[] args) {
        int n, fibo1=1,fibo2=0, temp;
        Scanner inf = new Scanner(System.in);
        System.out.println("Fibonacci serisi için eleman sayısı giriniz: ");
        n = inf.nextInt();

        for(int i=0; i<n; i++){
            if(i==0){
                System.out.println(fibo2 + " ,");

            }else if(i ==1){
                System.out.println(fibo1 + ", ");
            }else{
                temp = fibo2+fibo1;
                System.out.println(temp + ",");
                fibo2 = fibo1;
                fibo1 = temp;
            }
        }
    }
}
