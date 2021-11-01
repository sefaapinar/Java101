package Conditions;
import java.util.Scanner;

public class WeatherApp {
    public static void main(String[] args) {
        int heat;
        Scanner wearther = new Scanner(System.in);
        System.out.println("Sıcaklık Değerini Giriniz: ");
        heat = wearther.nextInt();

        if(heat<5){
            System.out.println("Kayak Yapabilirsiniz");
        }
        else if (heat >=5 && heat <=15){
            System.out.println("Sinema Etkinliği Yapabilirsiniz");

        }else if(heat >=15 && heat<=25){
            System.out.println("Piknik Yapabilirsiniz");
        }else if(heat>=25){
            System.out.println("Yüzme Etkinliği Yapabilirsiniz");
        }else{
            System.out.println("Lütfen doğru bir değer giriniz");
        }

    }
}
