
import java.util.Scanner;

public class CylinderVolume{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter radius and height");
        int r = sc.nextInt();
        int h = sc.nextInt();

        System.out.println("Volume of Cylinder: " + 3.14*r*r*h);
        
    }
}