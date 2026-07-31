public class Scope{
    public static void main(String[] args) {
        
        int a = 10;
        int b = 20;
        String name = "Anand";

        // System.out.println(num); // you cannot access num in another class
        {
            a = 78; // changing the origin ref variable to some other value
            System.out.println(a);
            int c = 99;
            //values initialised in this block, will remain in block

            name = "Dipika";
            System.out.println(name);

        } 

    
    }
    static void random(){
        int num = 67;
        System.out.println(num);
    }
}