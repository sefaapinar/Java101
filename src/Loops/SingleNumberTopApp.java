package Loops;
import java.util.Scanner;
public class SingleNumberTopApp {
    public static void main(String[] args) {
        int number,total=0;

        Scanner say = new Scanner(System.in);


        do{
            System.out.println("Lütfen Bir sayı giriniz: ");
            number = say.nextInt();
            if(number % 2 ==0){
                total +=number;
            }
        }while(number>0);


        System.out.println("Toplam: " + total);

    }
}
