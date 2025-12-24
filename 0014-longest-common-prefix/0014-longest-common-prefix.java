class Solution {
    public String longestCommonPrefix(String[] v) {
                StringBuilder ans = new StringBuilder();

        // Sort the array of strings
        Arrays.sort(v);

        // First string after sorting
        String first = v[0];

        // Last string after sorting
        String last = v[v.length - 1];

        // Compare characters of the first and last strings
        for (int i = 0; i < Math.min(first.length(), last.length()); i++) {
            // Stop if characters are different
            if (first.charAt(i) != last.charAt(i)) {
                break;
            }

            // Add matching character to result
            ans.append(first.charAt(i));
        }

        // Return the final common prefix
        return ans.toString();
    }
}




//PRIFIX SHRINKING APPROACH (GOOD)
// class Solution {
//     public String longestCommonPrefix(String[] strs) {
//         if (strs == null || strs.length == 0) return "";

//         String prefix = strs[0];

//         for (int i = 1; i < strs.length; i++) {
//             while (!strs[i].startsWith(prefix)) {
//                 prefix = prefix.substring(0, prefix.length() - 1);
//                 if (prefix.isEmpty()) return "";
//             }
//         }
//         return prefix;
//     }
// }




// class Solution {
//     public String longestCommonPrefix(String[] strs) {
//         if (strs == null || strs.length == 0) return "";

//         for (int i = 0; i < strs[0].length(); i++) {
//             char ch = strs[0].charAt(i);

//             for (int j = 1; j < strs.length; j++) {
//                 if (i >= strs[j].length() || strs[j].charAt(i) != ch) {
//                     return strs[0].substring(0, i);
//                 }
//             }
//         }
//         return strs[0];
//     }
// }