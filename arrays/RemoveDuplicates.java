import java.util.Arrays;
public class RemoveDuplicates {
    
    public static void main(String[] args){
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        removeDuplicates(nums);

    }


    public static int removeDuplicates(int[] nums){
//only two adjacent values can be duplicates
// to check that we will iterate through the array to check all the values and 
// we will keep a pointer p1 to store the value where we have to fill the value
// we will be swapping the numbers such that we have all the unique values in the array for K
       
int p1 = 1;
//[p1] is [1] as first value can not be duplicate , its always unique
// we will start the loop from 1 as we are checking the value with i-1
        for(int i = 1; i < nums.length; i++){
            if(nums[p1] != nums[i-1]){
                //this means the number is a unique number
                nums[p1] =  nums[i];
                p1++;
            }
        }
        System.out.println(Arrays.toString(nums));
        return p1 + 1;

    }

}