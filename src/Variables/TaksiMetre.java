package Variables;
import java.util.Scanner;

public class TaksiMetre {
    public static void main(String[] args) {

        Scanner taksi = new Scanner(System.in);
        int km;
        double perKM = 2.20,total =10;

        //perKM = Kilometre Başına alınan yol.
        System.out.print("Gidilen Yol Mesafesini Giriniz = ");
        km = taksi.nextInt();

        total += (km*perKM);
        System.out.println("Tutar:"+total);



    }
}
