class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;
        HashMap<Character, Integer> charCount = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            charCount.merge(s.charAt(i), 1, Integer::sum);
            charCount.merge(t.charAt(i), -1, Integer::sum);
        }
        return charCount.values().stream().allMatch(v -> v == 0);
    }
}
