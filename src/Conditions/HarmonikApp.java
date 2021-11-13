package Conditions;
import java.util.Scanner;

public class HarmonikApp {
    public static void main(String[] args) {

        Scanner imp = new Scanner(System.in);
        System.out.println("N sayısını giriniz: ");

        int n = imp.nextInt();
        double result = 0;
        for (int i=1; i<=n; i++){
            result += (1/n);
        }

        System.out.println(result);
    }
}
