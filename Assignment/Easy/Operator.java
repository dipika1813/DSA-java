import java.util.Scanner;

public class Operator{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a");
        int a = sc.nextInt();

        System.out.println("Enter b");
        int b = sc.nextInt();

        char op = sc.next().charAt(0);

        if (op == '+'){
            System.out.println(a + b);
        }

        if (op == '-'){
            System.out.println(a - b);
        }

        if (op == '*'){
            System.out.println(a * b);
        }

        if (op == '/'){
            if ( b != 0){
                System.out.println(a / b);
            }
            else{
                System.out.println("Cannot Divide by zero");
            }
        }

        
    }
}