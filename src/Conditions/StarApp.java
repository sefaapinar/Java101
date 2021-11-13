package Conditions;
import java.util.Scanner;

public class StarApp {
    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        System.out.print("Bir sayi giriniz: ");

        int number = klavye.nextInt();

        for (int i=0; i<=number; i++){
            for(int k=0; k<(number-i); k++){
                System.out.print(" ");
            }
            for(int s=1; s<=(2 * i +1); s++){
                System.out.print("*");
            }
        }
        System.out.print(" ");
    }
}
