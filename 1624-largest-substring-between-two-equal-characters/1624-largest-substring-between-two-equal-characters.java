//OPTIMAL SOLUTION

class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        int[] firstIndex = new int[26];
        Arrays.fill(firstIndex, -1);

        int maxLen = -1;

        for (int i = 0; i < s.length(); i++) {
            int ch = s.charAt(i) - 'a';

            if (firstIndex[ch] == -1) {
                // first time seeing this character
                firstIndex[ch] = i;
            } else {
                // character seen before → calculate distance
                int len = i - firstIndex[ch] - 1;
                maxLen = Math.max(maxLen, len);
            }
        }

        return maxLen;
    }
}



//BRUTE FORCE 
// class Solution {
//     public int maxLengthBetweenEqualCharacters(String s) {
//         int cnt =0;
//         int maxcnt = -1;
//         for(int i =0;i<s.length();i++){
//             for(int j=i+1; j<s.length();j++){
//             if(s.charAt(i) == s.charAt(j)){
//                cnt = j-i-1;
//                maxcnt = Math.max(cnt,maxcnt);
               
//             }
            
//         }
//         }
//         return maxcnt;
//     }  
// }
