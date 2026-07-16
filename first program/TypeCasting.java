import java.util.Scanner;

public class TypeCasting{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        // float num = sc.nextFloat();

        // type casting
        int num = (int)(67.54f);
        System.out.println(num);

        // automatic type promotion in expressions
        // int a = 257;
        // byte b = (byte)(a);  //257 % 256 = 1 (range of byte is 256)

        // byte a = 40;
        // byte b = 50;
        // byte c = 100;
        // int d = (a*b)/ c;

        // System.out.println(d);

        int numb = 'A';
        System.out.println(numb);  // Ascii value of A 

        // ex
        byte b= 45;
        char c ='a';
        short s = 2045;
        int i = 45555;
        float f = 2.45f;
        double d = 0.23332233;
        double result = (f*b) + (i/c ) - (d*s);
        //float + int - double = double
        System.out.println((f*b) + " " + (i/c ) + " " + (d*s));
        System.out.println(result);
        

    }
}