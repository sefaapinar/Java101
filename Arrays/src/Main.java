public class Main {
    public static void main(String[] args) {
        int [] numbers = new int[10];
        //arrayler boyutsuz verilemez.
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 20;

        int[] list = new int[10];
        System.out.println(list.length);

        for (int i = 0; i<list.length; i++){
            list[i] = i*10;
            System.out.println(list[i]);
        }
        System.out.println(numbers[1]);
    }
}