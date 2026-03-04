class Solution {
    public int minCostToMoveChips(int[] position) {
        int oddcount = 0;
        int evencount = 0;
        for(int p : position){
            if(p%2 == 0){
                evencount++;
            }else{
                oddcount++;
            }
            
        }
        return  Math.min(oddcount,evencount);
        
    }
}