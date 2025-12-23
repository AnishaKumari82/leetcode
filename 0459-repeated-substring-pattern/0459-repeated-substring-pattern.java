class Solution {
    public boolean repeatedSubstringPattern(String s) {
        
        int n = s.length();
        
        
         for(int i=1 ;i<= n/2;i++){
            if(n% i !=0) continue;
            String sub = s.substring(0,i);
            
            int times = n/sub.length();
            StringBuilder ss= new StringBuilder();

            for(int j=1 ;j<= times;j++){
                ss.append(sub);

            }
            if(s.equals(ss.toString())){
                return true;
            }
            

         }
         return false;

    
    }
}


// for (int len = 1; len <= n / 2; len++) {
//             if (n % len != 0) continue;

//             String sub = s.substring(0, len);
//             StringBuilder sb = new StringBuilder();

//             int times = n / len;
//             for (int i = 0; i < times; i++) {
//                 sb.append(sub);
//             }

//             if (sb.toString().equals(s)) {
//                 return true;
//             }
//         }
//         return false;