class IsHappyNumber {
    /* 
      For each digit will be calculated its square. All digit squares will be added and so until the result is lesser than 10. If the result is equals 1 or 7, it will return true. Otherwise it will return false.
    */
  
    public boolean isHappy(int n) {
        String sum = String.valueOf(n);
        int num = 0;

        do {
            for (char digit : sum.toCharArray()) {
                num += Character.getNumericValue(digit) * Character.getNumericValue(digit);
            }
            sum = String.valueOf(num);
            num = 0;
        } while (sum.length() >= 2);
        
        return Integer.valueOf(sum) == 1 || Integer.valueOf(sum) == 7;
    }
}
