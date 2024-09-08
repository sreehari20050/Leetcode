class Solution {
    public int maximumWealth(int[][] accounts) {

        int sum = 0;
        int add = 0;

        for(int i = 0 ; i < accounts.length ; i++){
            add = 0;
            for(int j = 0 ; j < accounts[i].length ; j++){
                add += accounts[i][j];
            }
            sum = Math.max(sum,add);
        }

        return sum;
        
    }
}
