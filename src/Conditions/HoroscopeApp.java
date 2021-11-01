package Conditions;
import java.util.Scanner;
public class HoroscopeApp {
    public static void main(String[] args) {

        while(true){
            int month,day;
            String burc ="";
            Scanner input = new Scanner(System.in);
            System.out.println("Ay Olarak 1-12 Değer Aralığında ve Gün Olarak 1-31 Sayıları Arası Değer Giriniz.");
            System.out.println("Doğduğunuz Ay Sayısını giriniz: ");
            month = input.nextInt();

            System.out.println("Doğduğunuz Gün: ");
            day = input.nextInt();

            if((month == 1 && (day <= 21 && day >= 1)) || month == 12 && (day > 21 && day <= 31)) burc="oglak";
            if ((month == 2 && (day <= 19 && day >= 1)) || month == 1 && (day > 21 && day <= 31)) burc = "Kova";
            if ((month == 3 && (day <= 20 && day >= 1)) || month == 2 && (day > 19 && day <= 29)) burc = "Balık";
            if ((month == 4 && (day <= 20 && day >= 1)) || month == 3 && (day > 20 && day <= 31)) burc = "Koç";
            if ((month == 5 && (day <= 21 && day >= 1)) || month == 4 && (day > 20 && day <= 30)) burc = "Boğa";
            if ((month == 6 && (day <= 22 && day >= 1)) || month == 5 && (day > 21 && day <= 31)) burc = "İkizler";
            if ((month == 7 && (day <= 22 && day >= 1)) || month == 6 && (day > 22 && day <= 30)) burc = "Yengeç";
            if ((month == 8 && (day <= 22 && day >= 1)) || month == 7 && (day > 22 && day <= 31)) burc = "Aslan";
            if ((month == 9 && (day <= 22 && day >= 1)) || month == 8 && (day > 22 && day <= 31)) burc = "Başak";
            if ((month == 10 && (day <= 22 && day >= 1)) || month == 9 && (day > 22 && day <= 30)) burc = "Terazi";
            if ((month == 11 && (day <= 21 && day >= 1)) || month == 10 && (day > 22 && day <= 31)) burc = "Akrep";
            if ((month == 12 && (day <= 21 && day >= 1)) || month == 11 && (day > 21 && day <= 30)) burc = "Yay";


            if(burc.equals(""))
            {
                System.out.println("Lütfen Tekrar Deneyiniz, Düzgün Karekterler giriniz.");
                break;
            }else{
                System.out.println("Doğum gününüz:\n"+day+".gün" + month+".ay ve "+ "Burcunuz:" +burc);
            }
        }



    }
}
