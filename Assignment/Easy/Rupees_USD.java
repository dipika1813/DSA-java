import java.util.Scanner;

public class Rupees_USD{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Rupees:");
        int Rupees = sc.nextInt();

        double exchange = 85;

        double USD = Rupees / exchange;

        System.out.println(USD);


    }

}