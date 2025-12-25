class Solution {
    public boolean isIsomorphic(String s, String t) {

        // Edge case
        if (s.length() != t.length()) return false;

        HashMap<Character, Character> s2t = new HashMap<>();
        HashMap<Character, Character> t2s = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);

            // s -> t mapping
            if (s2t.containsKey(c1)) {
                if (s2t.get(c1) != c2) {
                    return false;
                }
            } else {
                s2t.put(c1, c2);
            }

            // t -> s mapping
            if (t2s.containsKey(c2)) {
                if (t2s.get(c2) != c1) {
                    return false;
                }
            } else {
                t2s.put(c2, c1);
            }
        }

        return true;
    }
}
