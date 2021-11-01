package Introduction;
import java.util.Scanner;

public class NotOrtalama {
    public static void main(String[] args) {
        int mat, fizik, kimya,turkce,tarih,muzik;

        Scanner genel = new Scanner(System.in);

        //Kullanıcıdan Değerleri alma

        System.out.println("Matematik Notunuzu Giriniz:");
        mat = genel.nextInt();

        System.out.println("Fizik Notunuzu Giriniz:");
        fizik = genel.nextInt();

        System.out.println("Kimya Notunuzu Giriniz:");
        kimya = genel.nextInt();

        System.out.println("Türkçe Notunuzu Giriniz:");
        turkce = genel.nextInt();

        System.out.println("Tarih Notunuzu Giriniz:");
        tarih = genel.nextInt();

        System.out.println("Müzik Notunuzu Giriniz:");
        muzik = genel.nextInt();

        int toplam = (mat+fizik+kimya+tarih+muzik+turkce);
        double sonuc = toplam /6;
        System.out.println("Ortalamanız: " + toplam);


    }
}
