import java.util.Scanner;
public class AverageNum{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("how many numbers:");
        int num = sc.nextInt();

        int sum = 0;
        int n;
        double average;


        for(int i =1; i<= num; i++){
            n = sc.nextInt();
            sum = sum + n;
        }






    }
}