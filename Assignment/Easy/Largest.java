import java.util.Scanner;
public class Largest{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first Number:");
        int a = sc.nextInt();

        System.out.print("Enter second Number:");
        int b = sc.nextInt();

        if (a > b){
            System.out.println("A is Largest");
        }
        else{
            System.out.println("B is largest");
        }
    }
}