public class Main {
    public static void main(String[] args) {

        int[] numberList = {44,23,12,46,886,2,1,0};

        int min = numberList[0];
        int max = numberList[0];

        for(int i:numberList){
            if(i<min){
                min = i;
            }else{
                max = i;
            }
        }System.out.println("Min Value: " + min);
        System.out.println("Max Value : " + max);
    }

}