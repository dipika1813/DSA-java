import java.util.Scanner;
public class Loops{
    public static void main(String[] args) {

        /*
        Syntax of for loop:

        for(initialization; condition; incre/decrement){
              //body
        }
        */

        //Q. Print number from 1 to 5
        for(int i= 1; i <= 5; i++){
            System.out.println(i);
        }

        //print number from 1 to n
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n:");

        int n = sc.nextInt();
        for(int i = 1; i <= n; i++){
            System.out.println(i);
        }

        //Print Hello World 10 times

        for(int i = 1; i <= 10; i++){
            System.out.println("Hello World");
        }

        //While Loops:
        /*
        Syntax:-

        while(condition){
            //body
        } 
        */

        int nm = 1;
        while(nm <= 5){
            System.out.println(nm);
            nm++;
        }

        
        //do while
        /*
        do{
         //body
        
        }
        while(condition){

          
        */

        int num = 1;
        do { 
            System.out.println(num);
            num++;
            
        } 
        while (num <= 5);
        }
     
    }
