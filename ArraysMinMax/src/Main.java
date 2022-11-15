public class Main {
    public static void main(String[] args) {

        int[] arr = {12,33,412,542,123,49,22};
        // min = başlangıç değerine vereceğiz yani [0}
        // max başlangıçı da list[0] diyeceğiz.

        int min = arr[0];
        int max = arr[0];

        for(int i: arr){
            if(i < min){
                min = i;
            }if(i>max){
                max = i;
            }
        }

        System.out.println("Min Value: " + min);
        System.out.println("Max Value: " + max);
    }
}