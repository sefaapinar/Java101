import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1=0;
        int n2=2;
        int n3;
        int number;

        System.out.println("Enter the number of elements in the Fibonacci series: ");
        number = scanner.nextInt();
        System.out.println("----------");


        for (int i=2; i<=number; i++){
            n3 = n1 + n2;
            System.out.println(" " + n3);
            n1 = n2;
            n2 = n3;
        }
    }
}