package Loops;
import java.util.Scanner;
public class doubleSingleApp {
    public static void main(String[] args) {
        int k;
        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen Bir sayı Giriniz :");
        k = input.nextInt();


        for(int i =1; i<=k; i++){
            if(i % 2 ==0 ){
                System.out.println("Girdiğiniz Sayı çift sayıdır.");
            }
        }
    }
}
