package Arrays.hashing;
import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> seen = new HashSet<>();

        for (int num : nums) {
            if (seen.contains(num)) {
                return true;   // duplicate found
            }
            seen.add(num);
        }
        return false; // no duplicates
    }
}
