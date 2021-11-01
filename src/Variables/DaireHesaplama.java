package Variables;
import java.util.Scanner;
public class DaireHesaplama {
    public static void main(String[] args) {

        Scanner daire = new Scanner(System.in);

        System.out.println("Dairenin Yarı Çapını Giriniz:");
        int r;
        double pi=3.14;

        r=daire.nextInt();

        double alan = pi*r*r;
        double cevre = 2*pi *r;

        System.out.println("Dairenin Alanı: " +alan);
        System.out.println("Dairenin Çevresi: "+cevre);

    }
}
