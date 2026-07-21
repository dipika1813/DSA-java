import java.util.Scanner;
public class Perimeter_Rect{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter length and bredth");
        int l = sc.nextInt();
        int b = sc.nextInt();

        int perimeter = 2*(l+b);
        System.out.println("perimeter of rectangle:" +perimeter);


        
    }
}