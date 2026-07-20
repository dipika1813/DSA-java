import java.util.Scanner;
public class Calculator{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) { 
            System.out.println("Enter the Operator:");
            char op = sc.next().trim().charAt(0);
            System.out.println();
            if (op == '+' || op == '-' || op == '*'|| op == '/' || op == '%'){
                System.out.println("Enter two numbers:");

                int a = sc.nextInt();
                int b = sc.nextInt();
                System.out.println();
                
                if(op == '+'){
                    System.out.println(a+b);
                }
                if(op == '-'){
                    System.out.println(a-b);
                }
                if(op == '*'){
                    System.out.println(a*b);
                }
                if(op == '/'){
                    if(b != 0){
                        System.out.println(a/b);

                    }
                }
                if(op == '%'){
                    System.out.println(a % b);
                }
             
        }       else if(op == 'x' || op == 'X'){
                    break;
                }
                else{
                    System.out.println("Invalid Operator!");
                }
        
    }
}
}