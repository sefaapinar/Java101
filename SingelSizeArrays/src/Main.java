import java.util.Arrays;

public class Main {
    static boolean isFind(int[] arr, int value){
        for(int i : arr){
            if(i==value){
                return  true;
            }
        }
        return  false;
    }
    public static void main(String[] args) {

        int[] list = {1,2,3,4,5,6,6,2,3,1,2,3,4,5,6,6,0,8,7};
        int[] dublicate = new int[list.length];
        int startIndex = 0;

        for(int i = 0; i<list.length; i++){
            for(int j = 0; j<list.length; i++){
                if(i != j && (list[i] == list[j])) {
                    if(isFind(dublicate, list[i])){
                        dublicate[startIndex++] = list[i];
                    }

                    break;
                }
            }
        }

        System.out.println(Arrays.toString(dublicate));

    }
}