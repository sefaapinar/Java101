package Conditions;
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        int number1,number2,choose;

        //choose (seçim anlamında kullanıldı)
        Scanner clc = new Scanner(System.in);
        System.out.print("Birinci Sayıyı Giriniz: ");
        number1 = clc.nextInt();

        System.out.print("İkinci Sayıyı Giriniz: ");
        number2 = clc.nextInt();

        System.out.println("1-Toplama\n2-Cikarma\n3-Carpma\n4-Bolme");
        System.out.println("Seçiminiz Nedir: ");
        choose = clc.nextInt();


        switch (choose){
            case 1:
                System.out.println("Toplama: " + (number1+number2));
                break;
            case 2:
                System.out.println("Çıkarma :" + (number1-number2));
                break;
            case 3:
                System.out.println("Carpma: " + (number1*number2));
                break;
            case 4:
                System.out.println("Bolme: " +(number1/number2));
                break;
            default:
                System.out.println("Hatala İşlem Yaptınız Lütfen Tekrar Deneyiniz.");
                System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\4-Bölme");

        }


    }
}
