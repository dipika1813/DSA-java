import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a fruit?");

        String fruit = sc.next();
        
        // .equals --> checks if value is same

    //     if(fruit.equals("mango")) {
    //         System.out.println("king of fruits");
    //     }
    //     if(fruit.equals("apple")) {
    //         System.out.println("sweeet fruit");
    //     }
    //     else{
    //         System.out.println("Invalid Fruit name");
    //     }
           
        // switch(fruit){
        //     case "mango":
        //         System.out.println("king of fruits");
        //         break;

        //     case "apple":
        //         System.out.println("A sweet fruit");
        //         break;
            
        //     case "orange":
        //         System.out.println("small fruit");
        //         break;
                
        //     default:
        //         System.out.println("enter a valid fruit");
        // }
                         
                        //OR
        // use enhanced (rule) switch
        switch (fruit) {
            case "mango" -> System.out.println("king of fruits");
            case "apple" -> System.out.println("A sweet fruit");
            case "orange" -> System.out.println("small fruit");
            default -> System.out.println("enter a valid fruit");
        }


    }   
}