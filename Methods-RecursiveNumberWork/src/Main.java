import java.util.Scanner;

public class Main {
    public static void pattern(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("please n number: ");
        int n = scanner.nextInt();
        int a = n;

        System.out.println(n + " ");
        for(int i = n; i>=0; i--){
            n-=5;
            System.out.println(n + " ");
            if(n <= 0){
                for(int j = n; j<=a; j++){
                    n+=5;
                    System.out.println(n + " ");
                    if(n == a){
                        break;
                    }
                }
                break;
            }
        }
    }
    public static void main(String[] args) {
        pattern();
    }
}