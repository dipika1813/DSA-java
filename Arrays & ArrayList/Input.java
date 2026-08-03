import java.util.Arrays;
import java.util.Scanner;

public class Input{
    public static void main(String[] args) {
        
        int[] arr = new int[5];

        // array of premitive 
        // arr[0]= 34;
        // arr[1]= 363;
        // arr[2]= 45;
        // arr[3]= 43;
        // arr[4]= 36;
        // //[34, 363, 45, 43, 36]
        // System.out.println(arr[4]);

        // // Input using for loops
        Scanner sc = new Scanner(System.in);

        // for(int i = 0; i < arr.length; i++){
        //     arr[i]= sc.nextInt();
        //     System.out.println(Arrays.toString(arr));

        // }

        // for(int num : arr){   // for every element in array, print the element
        //     System.out.print(num + " "); // here num represent element of the array
        // }

        //array of object
        String[] str = new String[4];
        for(int i = 0; i< str.length; i++){
            str[i] = sc.next();
        }
        System.out.println(Arrays.toString(str));

    }
}
