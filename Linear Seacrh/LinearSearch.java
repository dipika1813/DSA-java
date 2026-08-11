public class LinearSearch{
    public static void main(String[] args) {
        int [] nums = {23,45, 34,66,45,76,89, 65,43, 23,25};
        int target = 65;
        int ans = linearSearch(nums, target);
        System.out.println(ans);


    }

    //search in the array: return the index if the idem found
    //otherwise return -1
    // static int linearSearch(int[] arr, int target){
    //     if(arr.length == 0){
    //         return -1;
    //     }
    

    //     //run a for loop
    //     for (int index = 0; index < arr.length; index++){
    //         // check for element at every index if it is = target
    //         int element = arr[index];
    //         if(element == target){
    //             return index;

    //         }
    //     }
    //     //this line will execute if none of statement is executed 
    //     //hence target not found
    //     return -1;
    // }



    //return the element
    static int linearSearch(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }
    

        //run a for loop
        for (int index = 0; index < arr.length; index++){
            // check for element at every index if it is = target
            int element = arr[index];
            if(element == target){
                return element;

            }
        }
        //this line will execute if none of statement is executed 
        //hence target not found
        return -1;
    }


}