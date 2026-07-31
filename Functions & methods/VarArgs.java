
import java.util.Arrays;

public class VarArgs{
    public static void main(String[] args) {
        fun(23,45,66,78,43,45);  // print all the arguments in array - [ ]
        multiple(2, 3, "dipika");

    }

    static void multiple(int a, int b, String ...m){

        System.out.println(Arrays.toString(m));
    }








    static void fun(int ...v){  // .....v takes no of arguments
        System.out.println(Arrays.toString(v));

    }
}