import java.util.Scanner;

public class Main {

    public static int sum(int say1, int say2){
        int result = say1 + say2;
        System.out.println("Result =  " + result);
        return result;
    }

    public static int minus(int say1,int say2){
        int result = say1 - say2;
        System.out.println("Result = " + result);
        return result;
    }

    public static int times(int say1,int say2){
        int result = say1 * say2;
        System.out.println("Result = " + result);
        return result;
    }

    public static int divided (int say1,int say2){
        int result = say1 / say2;
        System.out.println("Result = " + result);
        return result;
    }


    public static int power(int say1,int say2){
        int result = 1;
        for (int i = 1; i<= say1; i++){
            result *= say1;
        }
        return result;
    }

    public static int mod(int say1,int say2){
        return say1 % say2;
    }

    public static void calcDik(int say1,int say2){
        System.out.println("environment =  " + (2 * (say1 + say2)));
        System.out.println("Area = " + (say1 * say2));

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int select = 0;
        String menu = "1- TOPLA  \n" +
         "2- CIKAR\n" +
                "3- CARP\n" +
                 "4 - BOL\n" +
                 "5- USLU SAYI\n" +
                "6- MOD AL \n" +
                "7- DIKTORGEN ALAN VE CEVRE\n" +
                "0 - CIKIS YAP";

        do{
            System.out.print("please process choose = " + menu);
            select = scanner.nextInt();
            System.out.println("Please enter the first number");
            int say1 = scanner.nextInt();
            System.out.println("Please enter the second number");
            int say2 = scanner.nextInt();
            int result = 0;

            switch (select){
                case 1:
                    sum(say1,say2);
                    break;
                case 2:
                    minus(say1,say2);
                    break;
                case 3:
                    times(say1,say2);
                    break;
                case 4:
                    divided(say1,say2);
                    break;
                case 5:
                    System.out.println("Result = " + power(say1,say2));
                    break;
                case 6:
                    System.out.println("Result = " + mod(say1,say2));
                    break;
                case 7:
                    calcDik(say1,say2);
                    break;
                default:
                    System.out.println("Invalid Transaction, Please Try Again...");

            }
        }while(select !=0);



    }
}