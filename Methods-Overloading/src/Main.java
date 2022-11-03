public class Main {

    static void print(){
        System.out.println("Parametresiz Method");
    }

    static void print(int a){
        System.out.println("Parametreler :" + a);
    } //burada bu voidin aşırı yüklemesine sebep olduk.

    static int print(int a,int b){
        return  a + b;
    }

    static int print(int a, int b, int c){
        return a + b + c;
    }
    public static void main(String[] args) {
        print();
        print(12);
        System.out.println(print(1,2));
        System.out.println(print(2,3,4));
    }
}