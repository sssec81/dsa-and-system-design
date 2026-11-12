import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;
public class TwoSum {
    // two sum a method which accepts two parameters one array with numbers and target which is sum of two elements of array

    public static int[] returnIndices(int[] nums,int target){
        // lets create a HashMap which stores the number and its indices and check that hashmap if that already contains its
        // complement if it has it return that indices and that complement indices
        Map<Integer,Integer> sums = new HashMap<>();
        for (int i = 0;i<nums.length;i++){
            int complement = target - nums[i];
            if (sums.containsKey(complement)){
                return new int[]{sums.get(complement),i};
            }
            sums.put(nums[i],i);

        }
        return new int[]{};


    }
    public static void main(String[] args){
        int [] nums = {1,2,3,4};
        int [] indices = returnIndices(nums,7);
        System.out.println(Arrays.toString(indices));
    }
}