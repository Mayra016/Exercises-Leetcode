class CookiesForChildren {
    public int findContentChildren(int[] g, int[] s) {
        int result = 0;
        int optimalIndex = Integer.MAX_VALUE;
        HashMap<Integer, String> indexes = new HashMap<>();

        for (int i = 0; i < g.length; i++) {
            for (int x = 0; x < s.length; x++) {
                // Check if this pair index - value was already asigned to other children
                String currentValue = String.valueOf(s[x] + "index" + x);
                if (s[x] >= g[i] && !indexes.containsValue(currentValue)) {
                    if (s[x] < optimalIndex) {
                        String value = String.valueOf(s[x] + "index" + x);
                        optimalIndex = s[x];
                        indexes.put(i, value);
                        
                    }
                }
            }  
            if (optimalIndex != Integer.MAX_VALUE) {
                result++;
            }
            optimalIndex = Integer.MAX_VALUE;
        }

        return result;
    }
}
