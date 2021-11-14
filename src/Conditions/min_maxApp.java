package Conditions;
import java.util.Scanner;
public class min_maxApp {
    public static void main(String[] args) {
        // Girilen sayılardan min ve max degerli olanları bulan program
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE, temp =1, n=1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Giriş Yapılacak sayılar arasında min ve max sayıları belirlendi.");
        System.out.println("Sayılar varsayılan olarak min, max olmak üzere belirlendi.");

        while(n !=0){
            System.out.println("Bir sonraki sayıyı giriniz, Çıkış için 0'tuşlayınız.");
            n = scanner.nextInt();


            //minimum belirleleme
            if(n < min){
                min = n;
                if(n>max){
                    max = n;
                }else if(n > max){
                    max = n;
                }
            }
        } System.out.println("Girilen minimum sayı: " +min + ", maksiumum sayı:  " + max);

        System.out.println("Sistemden çıkış yapılıyor...");
    }
}
