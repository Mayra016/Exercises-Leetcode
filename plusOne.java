class PlusOne {
    /*
      Example 1:

      Input: digits = [1,2,3]
      Output: [1,2,4]
      Explanation: The array represents the integer 123.
      Incrementing by one gives 123 + 1 = 124.
      Thus, the result should be [1,2,4].
    */
    public int[] plusOne(int[] digits) {
        boolean nine = false;

        if (digits.length == 1 && digits[0] == 9 ) {
            return new int[] {1, 0};
        }

        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9 && nine == true) {
                digits[i]++;
                nine = false;
                break;
            }

            if (digits[i] == 9 && nine == true) {
                digits[i] = 0;
            }

            if (digits[i] < 9 && nine == false) {
                digits[i]++;
                nine = false;
                break;
            }

            if (digits[i] == 9 && nine == false) {
                digits[i] = 0;
                nine = true;
            }
        }

        if (digits[0] == 0) {
            int[] result = new int[] {1};
            int[] finalNums = new int[digits.length + String.valueOf(digits[0]).length()];

            System.arraycopy(result, 0, finalNums, 0, 1);
            System.arraycopy(digits, 0, finalNums, 1, digits.length);

            return finalNums;
        }

        return digits;
    }
}
