public class MultiDimension{
    public static void main(String[] args) {
        
        /*
          1 2 3
          4 5 6
          7 8 9
        
        */
       int[][] arr = new int[3][3];  //No.of rows are mandatory 

       int [][] arr2 = {

            {1, 2, 3},  //index 0
            {4, 5},  //index 1
            {7, 8, 9},   //index 2
       };
        System.out.println(arr2[1][0]);    //---> 0th item of  index 1 = 4

    }
}