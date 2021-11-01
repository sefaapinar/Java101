package Variables;
import java.util.Scanner;

public class KdvHesaplama {
    public static void main(String[] args) {

        Scanner hesap = new Scanner(System.in);
        double tutar,kdvOran=0.18;

        System.out.println("Ücreti Giriniz: ");
        tutar = hesap.nextDouble();

        double kdvTutar = tutar * kdvOran;
        System.out.println("Kdvli Hesaplamanız: " +kdvTutar);

    }
}
