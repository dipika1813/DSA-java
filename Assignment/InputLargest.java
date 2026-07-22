// Take integer inputs till the user enters 0 and print the largest number from all.

import java.util.Scanner;
public class InputLargest{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Numbers:");

        int num = sc.nextInt();
        int largest = 0;

        while(num != 0){
            if(num > largest){
                largest = num;
            }
            num = sc.nextInt();
        }
        System.out.println("largest number is"+largest);

        
    }
}