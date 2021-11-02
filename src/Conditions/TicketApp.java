package Conditions;
import  java.util.Scanner;
import java.util.SortedMap;

public class TicketApp {
    public static void main(String[] args) {

        int age,km,typeOfJourney;
        double distanceKm=0.10;


        Scanner air = new Scanner(System.in);
        System.out.print("Gideceğiniz Mesafeyi KM cinsinden yazınız: ");
        km = air.nextInt();

        if(km <= 0){
            System.out.print("Lütfen Tekrar Deneyiniz.");
            return;
        }

        System.out.print("Lütfen Yaşınızı Giriniz: ");
        age = air.nextInt();

        if(age<=0){
            System.out.print("Lütfen Tekrar Deneyiniz: ");
            return;
        }

        System.out.print("Lütfen Yolculuk Tipini Seçiniz: " + "1- GİDİŞ VEYA DÖNÜŞ 2-GİDİŞ-DÖNÜŞ TARİFESİ = " );
        typeOfJourney = air.nextInt();

        if(!(typeOfJourney == 1 || typeOfJourney == 2)){
            System.out.println("Yolculuk Belirlenen şekilde olmalıdır. ");
            return;
        }

        double discount=0;
        double ticket = distanceKm * km;

        if(age<12){
            discount = ticket /2;
            System.out.println("Yaşınız 12'den Küçük Olduğu için bilet fiyatından %50 indirim uygulandı: " + discount + "TL");
        }
        else if (age>=12 && age<=24){
            discount = (ticket * 10)/100;
            System.out.println("Yaşınız 12-24 Olduğunuz için bilet fiyatından %10 indirim uygulandı: " + discount + "TL");
        }
        else if (age<65){
            discount = ticket;
            System.out.println("Bilet Tutarınız = " + discount + "TL");
        }
        else if(age>=65){
            discount = (ticket * 30)/100;
            System.out.println("Yaşınız 65 yaş ve üzeri olduğu için bilet fiyatınıza %30 indirim uygulandı: " + discount + "TL");
        }

        if(typeOfJourney == 2){
            discount = (ticket * 20)/100;
            System.out.println("Bilet Tarifeniz GİDİŞ-DÖNÜŞ OLDUĞU için sizlere %20 indirim uygulanmıştır. " + discount + "TL");
        }













    }
}
