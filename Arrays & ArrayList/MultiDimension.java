import java.util.Arrays;
import java.util.Scanner;

public class MultiDimension{
    public static void main(String[] args) {
        
        /*
          1 2 3
          4 5 6
          7 8 9
        
        */
       Scanner sc = new Scanner(System.in);
       int[][] arr = new int[3][];  //No.of rows are mandatory 

    //    int [][] arr2 = {

    //         {1, 2, 3},  //index 0
    //         {4, 5,7},  //index 1
    //         {7, 8, 9},   //index 2
    //    };
    // System.out.println(arr2[1][0]);    //---> 0th item of  index 1 = 4


    int[][] arr3 = new int[3][3];
    System.out.println(arr3.length);  //no of rows

    for(int row = 0; row < arr3.length; row++){
        //for each colm in every row
        for(int colm = 0; colm < arr3[row].length; colm++){
            arr3[row][colm] = sc.nextInt();

        }
    }

    // for(int row = 0; row < arr3.length; row++){
    //     //for each colm in every row
    //     for(int colm = 0; colm <arr3[row].length; colm++){
    //         System.out.print(arr3[row][colm] + " ");

    //     }
    //     System.out.println();         
    //     }

        //OR

        for(int row = 0; row < arr3.length; row++){
            System.out.println(Arrays.toString(arr3[row]));

        }


    }
    }
