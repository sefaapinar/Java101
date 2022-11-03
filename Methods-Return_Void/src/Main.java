public class Main {
//static bir metot içerisine dışarıdan bir metot çağırmak istersek o metoduda statik yapmamız gerekir.
//    static int sum(int say1,int say2){
//        return say1 + say2;
//    }
    static void sum(int a,int b){
        int result = a+b;
    }
    public static void main(String[] args) {
//            int result = sum(1,2) + sum(7,3);
//            System.out.println(result);
//        //Javada oluşturduğumuz method bize bir değer vermesini istiyorsak return atmak lazım.
//        System.out.println("Hello world!");

        sum(5,2);
    }

    //void metotlar geriye bir değer döndürmek istemediğimiz zamanlarda olabilir. Kullanabiliriz.
}