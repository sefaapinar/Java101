import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner number = new Scanner(System.in);
        System.out.println("Enter the please number");
        int size = number.nextInt();
        int list[] = new int[size];


        for(int i = 0; i<list.length; i++){
            System.out.println((i+1)+". number: ");
            list[i] = number.nextInt();

        }
        Arrays.sort(list);
        System.out.println(Arrays.toString(list));
    }
}