import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter the number of row:");
        int row = inp.nextInt();
        System.out.println("Enter the number of column");
        int col = inp.nextInt();

        int[][] matris = new int[row][col];
        int[][] transpose = new int[col][row];

        for(int i = 0; i<matris.length; i++){
            for(int j = 0; j<matris[i].length; i++){
                System.out.println("Enter the number of row: " + i + "- Column" + j + "\n");
                matris[i][j] = inp.nextInt();
            }
        }

        for(int i = 0; i<matris.length; i++){
            for(int j = 0; j<matris[i].length; j++){
                matris[i][j] = inp.nextInt();
            }
        }

        for(int i = 0; i<transpose.length; i++){
            for(int j = 0; j<transpose[i].length; j++){
                System.out.println(transpose[i][j] + " ");
            }
            System.out.println();
        }
    }
}