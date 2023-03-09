import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class CodeChallenge {

//    To solve this solution my thinking was to use a Set to remove duplicates then use the sort and Collections
//    methods to return a unique list in descending order.

//    I initially had it as one method performing both actions however refactored to make the removing of
//    duplicates its own method, therefore making it more reusable for example if returning a List with
//    duplicates removed in ascending order etc.

    public static Integer[] uniqueNumbers(Integer[] nums) {
//        Use a Set to get unique values and therefore remove any duplicates and
//        convert the set with duplicates removed back to Integer []
        Set<Integer> numsSet = new HashSet<>(Arrays.asList(nums));
        return numsSet.toArray(new Integer[0]);
    }

    public static Integer[] uniqueNumbersDesc(Integer[] nums) {
//        Use the uniqueNumbers method from above to remove duplicates and then sort in descending order
        Integer[] removedDuplicates = uniqueNumbers(nums);
        Arrays.sort(removedDuplicates, Collections.reverseOrder());
        return removedDuplicates;
    }

}
