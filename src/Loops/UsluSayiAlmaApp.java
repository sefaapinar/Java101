package Loops;
import java.util.Scanner;
public class UsluSayiAlmaApp {
    public static void main(String[] args) {
        int number,k;
        Scanner input = new Scanner(System.in);

        System.out.println("Üstü alınacak Sayıyı Giriniz: ");
        number = input.nextInt();

        System.out.println("Üst Olacak Sayıyı Giriniz: ");
        k = input.nextInt();

        int total = 1;
        int i =1;
        while(i <=k){
            total *=number;
            i++;
        }
        System.out.println("Sonuç : " +total);

    }
}
