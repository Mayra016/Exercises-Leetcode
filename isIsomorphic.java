class IsIsomorphic {
    public boolean isIsomorphic(String s, String t) {
        StringBuilder result = new StringBuilder();
        char previousS = ' ';
        char previousT = ' ';
        int tCounter = 0;
        int sCounter = 0;
        HashMap<Character, Character> equivalents = new HashMap<>();


        if (s.length() == 1 && t.length() == 1) {
            return true;
        }


        for (int i = 0; i < s.length(); i++) {
            if (previousS != s.charAt(i)) {
                sCounter++;
            }

            if (i < s.length() && !equivalents.containsKey(s.charAt(i)) && !equivalents.containsValue(t.charAt(i))) {
                equivalents.put(s.charAt(i), t.charAt(i));
                
            }
            previousS = s.charAt(i);
        }

        for (int z = 0; z < t.length(); z++) {
            if (t.charAt(z) != ' ' && t.charAt(z) != previousT || z == 0) {
                tCounter++;
            }
            previousT = t.charAt(z);
        }

        for (int x = 0; x < s.length(); x++) {
            if (x < s.length() - 1) {
                result.append(equivalents.get(s.charAt(x)));
            } else {
                result.append(equivalents.get(s.charAt(x)));
            }       
        }

        if (String.valueOf(result).equalsIgnoreCase(t)) {
            return true;
        } else {
            return false;
        }
    }
}
