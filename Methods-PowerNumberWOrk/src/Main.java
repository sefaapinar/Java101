import java.util.Scanner;

public class Main {

    public static int power(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the base number: ");
        int base = scanner.nextInt();
        System.out.println("Plase second number ");
        int second = scanner.nextInt();

        int result =1;
        for(int i =1; i<= second; i ++){
            result *= base;
            if(second == 0){
                return  1;
            }
        }
        System.out.println("Result: " + result);
        return result;
    }
    public static void main(String[] args) {
        power();
    }
}