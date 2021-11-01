package Conditions;
import java.util.Scanner;

public class User_Authentication {
    public static void main(String[] args) {
        String userName,password;

        Scanner giris = new Scanner(System.in);

        System.out.println("Kullanıcı Adınızı Giriniz :");
        userName = giris.nextLine();

        System.out.println("Password Giriniz :");
        password = giris.nextLine();

        if(userName.equals("Sefa") && password.equals("12345")){
            System.out.println("Giriş Yaptınız: ");

        }else{
            System.out.println("Kullanıcı Adı veya Şifresiniz Yanlış. Lütfen Tekrar Deneyiniz. ");
        }






    }
}
