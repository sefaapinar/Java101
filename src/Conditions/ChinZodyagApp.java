package Conditions;
import java.util.Scanner;
public class ChinZodyagApp {
    public static void main(String[] args) {

        int zodiac;
        Scanner zodyag = new Scanner(System.in);

        System.out.println("Doğum Yılınızı Giriniz: " + "SADECE YYYY ŞEKLİNDE GİRİNİZ = ");
        zodiac = (zodyag.nextInt()%12);

        switch (zodiac){
            case 0:
                System.out.print("Çin Zodyağına göre burnucuz : Maymun ");
                break;
            case 1:
                System.out.println("Çin Zodyağına göre burnucuz : Horoz ");
                break;
            case 2:
                System.out.println("Çin Zodyağına göre burnucuz : Köpek ");
                break;
            case 3:
                System.out.println("Çin Zodyağına göre burnucuz : Domuz ");
                break;
            case 4:
                System.out.println("Çin Zodyağına göre burnucuz : Fare ");
                break;
            case 5:
                System.out.println("Çin Zodyağına göre burnucuz : Öküz ");
                break;
            case 6:
                System.out.println("Çin Zodyağına göre burnucuz : Kaplan ");
                break;
            case 7:
                System.out.println("Çin Zodyağına göre burnucuz : Tavşan ");
                break;
            case 8:
                System.out.println("Çin Zodyağına göre burnucuz : Ejderha");
                break;
            case 9:
                System.out.println("Çin Zodyağına göre burnucuz : Yılan ");
                break;
            case 10:
                System.out.println("Çin Zodyağına göre burnucuz : At ");
                break;
            case 11:
                System.out.println("Çin Zodyağına göre burnucuz : Koyun ");
                break;
        }
    }
}
