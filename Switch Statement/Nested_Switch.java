import java.util.Scanner;
public class Nested_Switch{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int empID = sc.nextInt();
        String department = sc.next();

        switch(empID){
            case 1:
                System.out.println("Dipika Pawar");
                break;

            case 2:
                System.out.println("Isha Singh");
                break;
            
            case 3:
                System.out.println("Emp no 3");
                switch(department){
                    case "IT":
                        System.out.println("IT dept");
                        break;
                    case "Management":
                        System.out.println("Management dept");
                        break;
                    default:
                        System.out.println("No dept entered");
                }
                break;
            default:
                System.out.println("enter correct ID");


        }
    }
}