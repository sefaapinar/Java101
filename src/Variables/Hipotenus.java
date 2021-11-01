package Variables;
import java.util.Scanner;

public class Hipotenus {
    public static void main(String[] args) {

        Scanner ucgen = new Scanner(System.in);
        int kenar1,kenar2;
        double kenar3;

        System.out.println("Kenar 1 Uzunluğunu giriniz:");
        kenar1 = ucgen.nextInt();

        System.out.println("Kenar 2 Uzunluğunu giriniz:");
        kenar2 = ucgen.nextInt();

        System.out.println("Kenar 3 Uzunluğunu giriniz:");
        kenar3 = ucgen.nextDouble();

        kenar3= Math.sqrt((kenar1*kenar1)+(kenar2*kenar2));
        System.out.println("Hipotenüs : " +kenar3);

    }

}
