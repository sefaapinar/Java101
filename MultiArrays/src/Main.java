public class Main {
    public static void main(String[] args) {


        int[] list2 = {1,2,3,4,5,6,7,8};

        int[][] matris = new int[6][6];
        matris[0][0] = 0;
        matris[2][3] = 839;

        int[][] uzaklik ={
                {0, 453, 939, 243, 783, 891},
                {453, 0, 490, 384, 620, 439},
                {939, 490, 0, 839, 863, 423},
                {243, 384, 839, 0, 544, 823},
                {783, 620, 863, 544, 0, 1045},
                {891, 439, 423, 823, 1045, 0}
        };

        int [][] matrix = {
                {1,2,3,4,5,6,7,8,9,0,9,1,2,3,4,5,6,7,8,3}
        };

        System.out.println(matris[2][3]);
    }
}