class ContainsTheSameLetters. {
  /*
    Check if ransomNote can be wroten with the letters of magazine
  */
    public boolean canConstruct(String ransomNote, String magazine) {
        for (char letter : magazine.toCharArray()) {
            ransomNote = ransomNote.replaceFirst(String.valueOf(letter), "");
        }

        if (ransomNote.length() == 0) {
            return true;
        } else {
            return false;
        }
    }
}
