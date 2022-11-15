import java.util.Arrays;


public class Main {
    public static void main(String[] args) {

        int[] list = {1,2,3,4,5,6};
//        int[] list2 = {5,6,7,3,4,5,6};
//        HelperArray helper = new HelperArray();
//        helper.print(list);
//        helper.print(list2);

//        Arrays.fill(list,10);
//        System.out.println(Arrays.toString(list));
//
//        //toString dizilerimizi ekrana bastıran bir dizidir.
//        System.out.println(Arrays.toString(list));
        Arrays.sort(list); //verileri küçükten büyüğe doğru sıralar.
        System.out.println(Arrays.toString(list));

        //binary search işleminde her zaman dizi sıralanır.
    }
}