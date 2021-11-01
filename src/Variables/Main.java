package Variables;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a,b;
        Scanner input = new Scanner(System.in);

        System.out.println("A sayısını Giriniz:...");
        a = input.nextInt();

        System.out.println("B sayısını Giriniz:...");
        b = input.nextInt();

        System.out.println("A sayısı: " + a);
        System.out.println("B sayısı: " + b);

    }
}
