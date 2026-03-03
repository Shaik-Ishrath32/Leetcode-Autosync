class Solution {
    public int numSpecial(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        //count 1's in row
        int [] rowcount = new int[n];
        for(int i=0;i<n;i++){
            int count = 0;
            for(int j=0;j<m;j++){
                count += mat[i][j];
                }
                rowcount[i] = count;
        }
        //count of 1's in coloumns
        int[] colcount = new int[m];
        for(int  j=0;j<m;j++){
            int count = 0;
            for(int i=0;i<n;i++){
                count += mat[i][j];
            }
            colcount[j] = count;
        }
        //check how many special positions are there in the matrix
        //initially special positions are zero
        int specialpositions = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(mat[i][j] == 1 && rowcount[i] == 1 && colcount[j] == 1){
                    specialpositions++;
                }
            }
        }
        return specialpositions;
    }
}