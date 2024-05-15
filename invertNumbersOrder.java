class InvertNumbersOrder. {
    public int reverse(int x) {
        int z = String.valueOf(x).length() - 1;
        String digits = String.valueOf(x);
        StringBuilder result = new StringBuilder();

        for (int i = z; i >= 0; i--) {
            result.append(String.valueOf(digits.charAt(i)));
        }

        if (result.toString().contains("-")) {
            result.deleteCharAt(z);
            digits = '-' + result.toString();
            return Integer.valueOf(digits);
        }

        return Integer.valueOf(String.valueOf(result));
    }
}
