class Solution {
    public int finalValueAfterOperations(String[] operations) {

        int result = 0;
        for(int i = 0 ; i < operations.length; i++){
            String temp = operations[i];
            if(temp.equals("++X") || temp.equals("X++")){
                result+=1;
            }
            else{
                result-=1;

            }
        }
        return result;
    }
}
