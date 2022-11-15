public class Main {
    public static void main(String[] args) {

        int[] list = {1,22,33,44,55,23123,44414,14141,5553};
//        double avarage = 0.0;
        int sum = 0;
        for(int i = 0; i<list.length; i++){
            sum += list[i];
        }

        double avarage = sum / list.length;
        System.out.println(avarage);

    }
}