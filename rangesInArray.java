import java.util.ArrayList;

class RangesInArray {

    /*
      Example 1:

      Input: nums = [0,1,2,4,5,7]
      Output: ["0->2","4->5","7"]
      Explanation: The ranges are:
      [0,2] --> "0->2"
      [4,5] --> "4->5"
      [7,7] --> "7"
    */
  
    public List<String> summaryRanges(int[] nums) {
        int x = 0;
        List<String> sequences = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                sequences.add(String.valueOf(nums[i]));
            }

            if (nums.length > 1 && i == nums.length - 1 && nums[i - 1] == nums[i] - 1) {
                sequences.set(x, sequences.get(x) + "->" + String.valueOf(nums[i]));
                break;
            }

            if (nums.length > 1 && i > 0 && nums[i - 1] != nums[i] - 1) {                
                if (!sequences.get(x).equals(String.valueOf(nums[i - 1]))) {
                    sequences.set(x, sequences.get(x) + "->" + String.valueOf(nums[i - 1]));
                }                   
                x++;
                sequences.add(String.valueOf(nums[i]));
            }

            
        }

        return sequences;
    }
}
