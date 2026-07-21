import java.util.Scanner;
public class TriangleArea{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length and bredth");
        int length = sc.nextInt();
        int breadth = sc.nextInt();

        System.out.println(length * breadth);
        
    }
}