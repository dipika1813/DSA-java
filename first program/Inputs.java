
import java.util.Scanner;

public class Inputs{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your roll no:");
        int rollNo = sc.nextInt();
        System.out.println("Your roll no is : " + rollNo);

        // literals
        int a = 10_000_00;
        System.out.println(a);

        String name = sc. next();
        System.err.println(name);

        float marks = sc.nextFloat();
        System.out.println(marks);
    }
}