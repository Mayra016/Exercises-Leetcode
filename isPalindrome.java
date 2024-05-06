class IsPalindrome {
    public boolean isPalindrome(String s) {

        s = s.replaceAll("[,\\s:\\p{Punct}]", "").toLowerCase();
        StringBuilder palindrome = new StringBuilder();
        

        for (int i = s.length() - 1; i >= 0; i--) {
            palindrome.append(s.charAt(i));       
        }


        if (palindrome.length() == s.length() && palindrome.toString().equalsIgnoreCase(s)) {
            return true;
        } else {
            return false;
        }
        
    }
}
