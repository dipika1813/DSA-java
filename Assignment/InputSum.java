import java.util.Scanner;
public class InputSum{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Check numbers:");
        int num = sc.nextInt();
        int sum = 0;

        while(num != 0){
            sum = sum + num;
            num = sc.nextInt();
        }
        System.out.println(sum);

    }
}