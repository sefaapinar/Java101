public class Main {

    static boolean isPalindrom(int number){
        int tmp = number, reverseNumber = 0,lastNumber;
        while(tmp != 0){
            System.out.println("==========");
            System.out.println("Number = " +tmp);
            lastNumber = tmp % 10;
            System.out.println("Son basamak =>" + lastNumber);
            reverseNumber = (reverseNumber * 10) + lastNumber;
            System.out.println("Yeni Sayi =>" + reverseNumber);
            tmp /= 10;
        }
        return true;
    }
    //Palindrom say? = iki taraftan okundu?u zaman okunu? yönüyle ayn? olan say?lard?r.
    public static void main(String[] args) {
//        int number = 2376;
//        int a = number % 10;
//        System.out.println(a);
        isPalindrom(2476);

    }
}