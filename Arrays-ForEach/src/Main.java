public class Main {
    public static void main(String[] args) {

        int[] list = {1,2,3,4,5};

        for(int i=0; i<list.length; i++) {
            System.out.println(list[i]);
        }

        int sum = 0;
        for(int i:list){
            sum += i;
        }

        System.out.println(sum);


        String[]  cars = {"BMW","AUDI","MERCEDES","RENAULTH"};
        for(String str: cars){
            System.out.println(str);
        }
    }
}