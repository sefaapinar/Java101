package Loops;
import  java.util.Scanner;

public class Faktoriyel {
    public static void main(String[] args) {
        int number;
        int total = 1;
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir sayıyı giriniz: ");
        number = input.nextInt();


        for(int i =1; i<number; i++){
            total = total *i;

        }
        System.out.println(number + ". Faktöriyel: " + total);

    }
}
