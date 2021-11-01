package Conditions;
import java.util.Scanner;

public class ClassSuccessStay {
    public static void main(String[] args) {
        int mat,fizik,turkce,kimya,muzik;
        Scanner lesson = new Scanner(System.in);

        System.out.println("Matematik Notunuzu Giriniz : " );
        mat = lesson.nextInt();

        System.out.println("Fizik Notunuzu Giriniz : " );
        fizik = lesson.nextInt();

        System.out.println("Turkce Notunuzu Giriniz : " );
        turkce = lesson.nextInt();

        System.out.println("Muzik Notunuzu Giriniz : " );
        muzik = lesson.nextInt();

        System.out.println("Kimya Notunuzu Giriniz : " );
        kimya = lesson.nextInt();

        double avarage = (mat+kimya+fizik+muzik+turkce) /5;

        if(avarage <=55){
            System.out.println("Seneye Tekrardan Görüşmek üzere :" + avarage);
        }
        else{
            System.out.println("Tebrikler Sınıfı Geçtiniz." + avarage);
        }
    }
}
