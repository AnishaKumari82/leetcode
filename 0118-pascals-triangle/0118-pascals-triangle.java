class Solution {

    public List<Integer> generaterow(int row){
        long ans =1;
        List<Integer> ansrow = new ArrayList<>();
        ansrow.add(1);
        for(int col=1;col<=row;col++){
            ans = ans *(row-col+1);
            ans = ans/col;
            ansrow.add((int)ans);
        }
        return ansrow;
    }
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        for(int i =0;i<numRows;i++){
            ans.add(generaterow(i));
        }
        return ans;
        
    }
}