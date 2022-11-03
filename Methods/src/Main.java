public class Main {
    static int power(int base, int exp) {

        int result = 1;

        for(int i = 1; i<=exp; i++){
             result *=base;
        }
        return result;



    }

    public static void main(String[] args) {

//        int base = 2, exp=3, result = 1;
//
//        for(int i = 1; i<=3; i++){
//            result *= base;
//        }
//        System.out.println(base);

        int n1 =2, n2=3;
        int case1 = power(2,3);
        System.out.println(case1);

    }
}