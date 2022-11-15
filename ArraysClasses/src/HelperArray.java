public class HelperArray {

    static void print(int[] arr){
        System.out.println("[");
        for(int i = 0; i<arr.length; i++){
            System.out.println(arr[i] + " ") ;
        }
    }

    static int[] fill(int[] arr, int values){
        for(int i = 0; i<arr.length; i++){
            arr[i] = values;
        }
        return arr;
    }

    static int search(int[] arr, int searchValue){
        for(int i = 0; i<arr.length; i++){
            if(arr[i] == searchValue){
                return i;

            }
        }
        return -1;
    }
}
