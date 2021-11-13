package Loops;
import  java.util.Scanner;
import java.util.SortedMap;

public class TwoPower {
    public static void main(String[] args) {
        int number;
        Scanner inp = new Scanner(System.in);
        System.out.println("Sınır sayınızı giriniz: ");
        number = inp.nextInt();

        for (int i=1; i<=number ; i*=2){
            System.out.println(i);
        }
    }
}
