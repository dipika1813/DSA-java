import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListEx{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //Syntax of ArrayList
        ArrayList<Integer> list = new ArrayList<>();
        // list.add(10);
        // list.add(360);
        // list.add(340);
        // list.add(3320);
        // list.add(380);
        // System.out.println(list);

        // System.out.println(list.contains(569));  //false
        // list.set(0, 99);
        // System.out.println(list);  //idx 0 --> 99

        
        //Input()
        for(int i = 0; i< 5; i++){
            list.add(sc.nextInt());
        }

        System.out.println(list);

        // get item at any index
        for(int i = 0; i < 5; i++){
            System.out.println(list.get(i));
        }
        System.out.println(list);






    }
}