package Conditions;
import java.util.Scanner;
public class TersUcgen {
    public static void main(String[] args) {
        int n ;
        Scanner imp = new Scanner(System.in);
        System.out.println("Ters üçgen şekli için satır sayını giriniz = ");
        n = imp.nextInt();

        for(int i = n; i>=1; i--){
            for(int j = n-i; j>=1; j--){
                System.out.print(" ");
            } for ( int j=1; j<=2*i-1; i++){
                System.out.println("*");
            }
            System.out.println();

        }
    }
}
