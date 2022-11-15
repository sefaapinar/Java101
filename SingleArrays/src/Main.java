public class Main {
    public static void main(String[] args) {

//        double[] list1 = new double[10];
//        list1[0] = 5.1;
//        list1[1] = 5.2;
//        list1[2] = 5.3;
//        list1[3] = 5.4;
//        list1[4] = 5.5;
//        list1[5] = 5.6;
//        list1[6] = 5.7;
//        list1[7] = 5.8;
//        list1[8] = 5.9;
//        System.out.println(list1[0]);

        String[] days = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
        days[0] = "Sunday"; // diziden karakter değiştirme.
        System.out.println(days.length);


        for(int i=0; i< days.length; i++){
            System.out.println(days[i]);
        }





    }
}