class StringValidsToInteger {
    /*
      Whitespace: Ignore any leading whitespace (" ").
      Signedness: Determine the sign by checking if the next character is '-' or '+', assuming positivity is neither present.
      Conversion: Read the integer by skipping leading zeros until a non-digit character is encountered or the end of the string is reached. If no digits were read, then the result is 0.
      Rounding: If the integer is out of the 32-bit signed integer range [-231, 231 - 1], then round the integer to remain in the range. Specifically, integers less than -231 should be rounded to -231, and integers greater than 231 - 1 should be rounded to 231 - 1.

      Examples:

      Input: s = " -042"
      Output: -42

      Input: s = "1337c0d3"
      Output: 1337

      Input: s = "words and 987"
      Output: 0
    
    */

  
    public int myAtoi(String s) {
        s = s.trim().replaceAll(" ", "");
        List<Character> nums = Arrays.asList('0', '1', '2', '3', '4', '5', '6', '7', '8', '9');

        if (s == "" || s.isEmpty()) {
            return 0;
        }

    
        try {
            if (Long.valueOf(s) <= -2147483648) {
                return -2147483648;
            }

            if (Long.valueOf(s) >= 2147483647) {
                return 2147483647;
            }

            return Integer.valueOf(s);
        } catch (Exception e) {
            for (int i = 0; i < s.length(); i++) {
                if (!nums.contains(s.charAt(i))) {
                    System.out.println(s.substring(0, i));
                    if (s.substring(0, i).isEmpty()) {
                        return 0;
                    }

                    if (s.substring(0, i).contains("-0")) {
                        System.out.println("SE EJECUTA");
                        return Integer.valueOf(s.substring(0, i).replaceAll("0", ""));
                    }

                    return Integer.valueOf(s.substring(0, i));
                }
            }
        }

        return 0;
        
    }
}
