class FindUniqueNumber {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> repeated = new HashMap<>();

        for (int i : nums) {
            if (repeated.containsKey(i)) {
                repeated.put(i, repeated.get(i) + 1);
            } else {
                repeated.put(i, 1);
            }
        }

        for (int key : repeated.keySet()) {
            if (repeated.get(key) == 1) {
                return key;
            }
        }

        return 0;
    }
}
