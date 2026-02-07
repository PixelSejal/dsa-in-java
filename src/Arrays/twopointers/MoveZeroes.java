package Arrays.twopointers;
import java.util.Arrays;
public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int k = 0 ;
        for (int i = 0 ; i<nums.length ; i++){
            if (nums[i] != 0){
                nums[k++] = nums[i];
            }
        }
        while (k<nums.length){
            nums[k++] = 0;
        }

    }
    public static void main(String[] args) {
        MoveZeroes obj = new MoveZeroes();
        int[] nums = {0, 1, 0, 3, 12};
        obj.moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }
}
