import java.util.Scanner;

public class Main {
    public static int prime(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = scanner.nextInt();

        if(number / number == 0){
            System.out.println("is the number prime" + number);
        }else if (number == 1){
            System.out.println("is not prime number " + number);
        }else{
            System.out.println("Please Try Again...");
        }
        return 1;
    }
    public static void main(String[] args) {
        prime();
    }
}