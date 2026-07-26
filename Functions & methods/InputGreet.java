
import java.util.Scanner;

public class InputGreet{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name:");

        String name = sc.next();
        String str = myGreet(name);
        System.out.println(str);

    }
    static String myGreet(String name){
        String message = "hello" + " " +name;
        return message;
    }
}