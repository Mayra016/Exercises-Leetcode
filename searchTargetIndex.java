class SearchTargetIndex {
    /*
      Search for the target's index. If the array doesn't contains the target value, it will return
      the index that the value should have.
    */
    public int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            int k = i == 0 ? 0 : 1;
            if (nums[i] == target || nums[i] > target && nums[i - k] < target) {
                return i;
            }

            if (i == 0 && nums[i] > target) {
                return 0;
            }
        }
        return nums.length;
    }
}
