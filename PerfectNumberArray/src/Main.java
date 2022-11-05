import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       /*
Bir sayının kendisi hariç pozitif tam sayı çarpanları (kalansız bölen sayıların) toplamı kendisine eşit olan sayıya mükemmel sayı denir.
Klavyeden girilen bir sayını{n mükemmel sayı olup/olmadığını bulan ve sayı mükemmel sayı ise ekrana “mükemmel sayıdır.”
değilse “mükemmel sayı değildir.” ifadelerini ekrana yazan programı Java dilinde yazınız.
 */

        Scanner scanner = new Scanner(System.in);
        int number;
        int total = 0;
        System.out.println("Please enter the number: ");
        number = scanner.nextInt();
        if(number <0){
            System.out.println("Please enter the positive numbers... Please try again.");
        }else{
            for(int i = 1; i<number; i++){
                if(number % i == 0){
                    total +=i;
                }
            }
            if(total == number){
                System.out.println(number + " this is a perfect number!!!");
            }else{
                System.out.println("This is a not perfect number!!!");
            }
        }
    }
}