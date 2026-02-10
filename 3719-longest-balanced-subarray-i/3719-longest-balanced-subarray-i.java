class Solution {
    public int longestBalanced(int[] nums) {
        int n = nums.length;
        int ans = 0;
        for(int i=0;i<n;i++){
            int [] even = new int[n];//track even
            int [] odd = new int[n];//track odd
            int evencount = 0;
            int oddcount = 0;
            for(int j=i;j<n;j++){
                int x = nums[j];
                if(x%2 == 0){
                    boolean found = false;
                    for(int k=0;k<evencount;k++){
                        if(even[k] == x){
                            found = true;
                            break;
                        }
                    }
                    if(!found){
                        even[evencount++] = x;
                    }
                }else{
                    boolean found = false;
                    for(int k=0;k<oddcount;k++){
                        if(odd[k] == x){
                            found = true;
                            break;
                        }
                    }
                    if(!found){
                        odd[oddcount++] = x;
                    }
                }
                if(evencount == oddcount){
                    ans = Math.max(ans,j-i+1);
                }
            }
        }
        return ans;
    }
}