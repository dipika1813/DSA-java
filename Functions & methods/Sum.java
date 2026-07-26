
import java.util.Scanner;

public class Sum{
    public static void main(String[] args) {
        // Sum s = new Sum();
        // s.display();
        sum();

    
        
    }

    public void sum(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number1:");
        int num1 = sc.nextInt();

        System.out.println("enter number2:");
        int num2 = sc.nextInt();

        int sum = num1 +num2;
        System.out.println(sum);
    }
    // void display(){
    //     sum();
    // }

}