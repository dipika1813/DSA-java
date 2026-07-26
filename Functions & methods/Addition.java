import java.util.Scanner;

public class Addition{
    public static void main(String[] args) {
        int ans = sum3(3,5);
        System.out.println(ans);
    
        
    }
    static int sum3(int a, int b){
        int sum = a+b;
        return sum;
    }

    static  void sum2(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number1:");
        int num1 = sc.nextInt();

        System.out.println("enter number2:");
        int num2 = sc.nextInt();

        int sum = num1 +num2;
        System.out.println(sum);
    }
   
}