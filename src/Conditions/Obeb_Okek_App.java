/*package Conditions;
import java.util.Scanner;

public class Obeb_Okek_App {
    public static void main(String[] args) {
        //Java ile 2 sayının obeb ve okek degerlerini bulunuz.

        int ebob, ekok, number1,number2, kucukSayi,buyukSayi;
        Scanner input = new Scanner(System.in);

        do {
            System.out.println("Hesaplamalar için 2 sayı giriniz:  " + "! GİRİLEMEZ.");
            System.out.println("number1: ");
            number1 = input.nextInt();

            System.out.println("number2 : ");
            number2 = input.nextInt();

            if (number1 < number2) {
                kucukSayi = number1;
                buyukSayi = number2;
            } else {
                kucukSayi = number2;
                buyukSayi = number1;
            }
            //Ebok bulalım.
            ebob = kucukSayi;
            int ebobtest = 0;
            while (number1 > 0 && number2 > 0 && kucukSayi % ebob == 0) {
                if (buyukSayi % ebob == 0 && kucukSayi % ebob == 0) {
                    System.out.println(number1 + " ve " + number2 + "sayilari icin ebob: " + ebob);
                    break;
                } else {
                    ebob--;
                }
            }


            if (number1 < number2) {
                kucukSayi = number1;
                buyukSayi = number2;
            } else {
                kucukSayi = number2;
                buyukSayi = number1;
            }
            ekok = buyukSayi;
            while (number1 != 0 && number2 != 0) {
                if (ekok % kucukSayi == 0) {
                    System.out.println(number1 + " ve " + number2 + " sayıları için ekok: " + ekok);
                    break;

                } else {
                    ekok += buyukSayi;
                }

            }
            if (number1 != 0 && number2 != 0 && ebob * ekok == number1 * number2) {
                System.out.println("Tebrikler işlemler başarılı: " + "(ebob*ekok = " + ebob * ekok + ") =(" + number1 * number2 + " = number1*number2)");
            } else if (number1 != 0 && number2 != 0) {
                System.out.println("kod hatası var..");

            }

        }
    }

 */

