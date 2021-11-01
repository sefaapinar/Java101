package Variables;
import java.util.Scanner;

public class ManavProgramı {
    public static void main(String[] args) {

        System.out.println("Sefa Manava Hoşgeldiniz...");
        Scanner mnv = new Scanner(System.in);
        double armut=2.14,elma=3.67,domates=1.11,muz=0.95,patlican=5.00;
        double armutKilo,elmaKilo,domatesKilo,muzKilo,patlicanKilo;



        System.out.print("Armut Kaç Kilo: " );
        armutKilo = mnv.nextDouble();
        double armutTutar = armut *armutKilo;

        System.out.print("Elma Kaç Kilo: " );
        elmaKilo = mnv.nextDouble();
        double elmaTutar = elma * elmaKilo;

        System.out.print("Domates Kaç Kilo: " );
        domatesKilo = mnv.nextDouble();
        double domatesTutar = domates * domatesKilo;

        System.out.print("Muz Kaç Kilo: " );
        muzKilo = mnv.nextDouble();

        double muzTutar = muzKilo*muz;

        System.out.print("Patlıcan Kaç Kilo: ");
        patlicanKilo = mnv.nextDouble();
        double patlicanTutar = patlican*patlicanKilo;

        double toplamFiyat = patlicanTutar+muzTutar+domatesTutar+armutTutar+elmaTutar;

        System.out.print("Sefa Manavdaki Toplam Alışveriş Tutarınız: " +toplamFiyat);





    }
}
