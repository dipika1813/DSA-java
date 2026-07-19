import java.util.Scanner;

public class CaseCheck{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().trim().charAt(0);

        // System.out.println(sc.next().trim()); //trim() removes the extra space at the end of word

        if(ch >= 'a' && ch <= 'z' ){
            System.out.println("lowercase");

        }
        else{
            System.out.println("uppercase");
        }

    }
}