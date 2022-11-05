public class Main {

//    static void print(){
//        System.out.println("Hi World.");
//        print();
//    }
//    static int sum(int x){
//        int result = 0;
//        for(int i =1; i<= x; i++){
//            result += i;
//        }
//        return result;
//    }

//    static int r(int n){
//        System.out.println(n);
//        if(n == 1){
//            return 1;
//        }
//        return r(n-1) + n;
//    }

//    public static int toplam(int k){
//        if(k>0){
//            return k + toplam(k-1);
//        }else{
//            return 0;
//        }
//    }

    static int basamaklarToplam(int sayi){
        if(sayi == 0){
            return 0;
        }
        else{
            return sayi % 10 + basamaklarToplam(sayi / 10);
        }
    }

    public static void main(String[] args) {
//        int sonuc = toplam(10);
//
//        System.out.println(sonuc);

        System.out.println("Basamaklar Toplami: " + basamaklarToplam(123213));
    }
}