// tc- O(n)
// sc-O(n^2)
// class Solution {
//     public int lengthOfLastWord(String s) {
//         String[] words = s.split(" ");
//         return words[words.length-1].length();
        
//     }
// }



class Solution {
    public int lengthOfLastWord(String s) {
        int n = s.length();
        int cnt=0;
        for(int i= s.length()-1 ; i>=0; i--){
            if(s.charAt(i) != ' '){
                cnt++;

            }else{
                if(cnt>0){
                    return cnt;
                }
            }
        }

        return cnt;
    }
}




// class Solution {
//     public int lengthOfLastWord(String s) {
//         int i = s.length() - 1;
//         int count = 0;

//         // Step 1: Skip trailing spaces
//         while (i >= 0 && s.charAt(i) == ' ') {
//             i--;
//         }

//         // Step 2: Count characters of last word
//         while (i >= 0 && s.charAt(i) != ' ') {
//             count++;
//             i--;
//         }

//         return count;
//     }
// }


