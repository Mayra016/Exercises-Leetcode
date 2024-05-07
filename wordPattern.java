class WordPattern {
    /*
      Find if the word s follows the pattern described
      Example: pattern: abba s: dog cat cat dog return true, because dog repeats the same times as a and cat repeats the same times as b
    */
  
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        StringBuilder result = new StringBuilder();
        char previousLetter = ' ';
        String previousWord = "";
        int patternCounter = 0;
        int sCounter = 0;
        HashMap<Character, String> equivalents = new HashMap<>();


        if (pattern.length() == 1 && s.length() == 1) {
            return true;
        }

        for (int i = 0; i < pattern.length(); i++) {
            if (previousLetter != pattern.charAt(i)) {
                patternCounter++;
            }

            if (i < words.length && !equivalents.containsKey(pattern.charAt(i)) && !equivalents.containsValue(words[i])) {
                equivalents.put(pattern.charAt(i), words[i]);
            }
            previousLetter = pattern.charAt(i);
        }

        for (int t = 0; t < words.length; t++) {
            if (words[t] != "" && !words[t].equals(previousWord) || t == 0) {
                sCounter++;
            }
            previousWord = words[t];
        }

        if (sCounter != patternCounter) {
            return false;
        }

        for (int x = 0; x < pattern.length(); x++) {
            if (x < pattern.length() - 1) {
                result.append(equivalents.get(pattern.charAt(x)) + " ");
            } else {
                result.append(equivalents.get(pattern.charAt(x)));
            }       
        }


        if (String.valueOf(result).equalsIgnoreCase(s)) {
            return true;
        } else {
            return false;
        }
    }
}
