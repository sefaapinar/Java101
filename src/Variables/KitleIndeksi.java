package Variables;
import java.util.Scanner;
public class KitleIndeksi {
    public static void main(String[] args) {

        Scanner ind= new Scanner(System.in);
        double boy,kilo,sonuc;

        System.out.print("Boy Değerinizi Giriniz: ");
        boy = ind.nextDouble();

        System.out.print("Kilo Değerinizi Giriniz: ");
        kilo = ind.nextDouble();

        sonuc = kilo / (boy * boy);

        System.out.println("Vucut Kitle İndeksiniz: " +sonuc);


    }
}
