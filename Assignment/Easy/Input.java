import java.util.Scanner;

public class Input{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Name:");
        String Name = sc.next();

        System.out.println("HellO! Good Morning " +Name);
    }
}