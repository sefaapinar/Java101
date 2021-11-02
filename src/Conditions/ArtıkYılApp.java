package Conditions;
import java.util.Scanner;
public class ArtıkYılApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean Isyear;
        int artıkYil;

        System.out.print("Yıl Giriniz: ");
        artıkYil = input.nextInt();
        Isyear =(artıkYil%4==0);

        if (Isyear){
            System.out.println(Isyear + " =" + " Bu yıl Artık yıldır ");
        }else{
            System.out.println("Bu yıl Artık yıl değildir.");
        }

    }
}
