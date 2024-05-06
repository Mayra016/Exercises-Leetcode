class IsSubsequence {
    public boolean isSubsequence(String s, String t) {
        boolean result = false;
        int x = 0;

        if (s.equals("")) {
            return true;
        }

        for (int i = 0; i < t.length(); i++) {
            if (x < s.length() && s.charAt(x) == t.charAt(i)) {
                x++;
                result = true;
            }
        }

        if (x >= s.length() && result == true) {
            return true;
        } else {
            return false;
        }
    }
}
