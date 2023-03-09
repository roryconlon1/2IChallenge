import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class CodeChallenge {

    public static Integer[] uniqueNumbers(Integer[] nums) {
//        Use a Set to get unique values and therefore remove any duplicates and
//        convert the set with duplicates removed back to Integer []
        Set<Integer> numsSet = new HashSet<>(Arrays.asList(nums));
        Integer[] removedDuplicates = numsSet.toArray(new Integer[numsSet.size()]);
        return removedDuplicates;
    }

    public static Integer[] uniqueNumbersDesc(Integer[] nums) {
//        Use the uniqueNumbers method from above to remove duplicates and then sort in descending order
        Integer[] removedDuplicates = uniqueNumbers(nums);
        Arrays.sort(removedDuplicates, Collections.reverseOrder());
        return removedDuplicates;
    }
}
