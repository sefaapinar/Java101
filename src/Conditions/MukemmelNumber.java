package Conditions;
import java.util.Scanner;
public class MukemmelNumber {
    public static void main(String[] args) {

        int n =1, toplam = 0;
        Scanner scn = new Scanner(System.in);

        while (n!=0){
            toplam = 0;
            System.out.println("Bir Tam Sayı Giriniz...");
            n = scn.nextInt();
            for(int i=1; i<n; i++){
                if(n % i ==0){
                    toplam+=i;
                }
            }
            if(toplam == n){
                System.out.println("Girilen sayı mükemmel bir sayıdır.");
            }else{
                System.out.println("Girilen Sayı mükemmel sayı değildir.");
            }
        }
    }
}
