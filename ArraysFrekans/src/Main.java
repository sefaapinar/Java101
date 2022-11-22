public class Main {
    public static void main(String[] args) {
       int[] arr = {10,20,30,40,50,10,20,30,40,40,40,20,30,55};
       int[] frekans = new int[arr.length];

       for(int i = 0; i<arr.length; i++){
           frekans[i] = 1;

           for( i = 0; i< arr.length; i++){
               for(int j = 0; j<arr.length; j++){
                   if((i != j) && (arr[i] == arr[j])){
                       frekans[i]++;
                   }
               }
           }

           for( i = 0; i<arr.length; i++){
               for(int j =0; j<arr.length; j++){
                   if((i!=j) && (arr[i] == arr[j])){
                       arr[j] = 0;
                   }
               }
           }

           for(i = 0; i<arr.length; i++){
               if(frekans[i] >=1){
                   if(arr[i] !=0){
                       System.out.println("The number " + arr[i] + " is repeated " + frekans[i] + "times.");
                   }
               }
           }

       }
    }
}