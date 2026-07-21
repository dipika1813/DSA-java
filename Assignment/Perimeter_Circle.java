
import java.util.Scanner;

public class Perimeter_Circle{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter radius :");
        int r = sc.nextInt();

        System.out.println("Perimeter of Circle:" + 2* 3.14* r);
    }
}