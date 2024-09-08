class Solution {
    public String rev(String a){
        String r = "";
        for(int i = a.length()-1;i>=0;i--){
            r = r + a.charAt(i);
        }        
        return r;
    }
    public int maximumNumberOfStringPairs(String[] words) {

        int count = 0;

        for(int i = 0 ; i < words.length ; i++ ){
            for(int j = i+1 ; j < words.length ; j++){
                String a =words[i];
                String b =words[j];
                String c = rev(b);
                if(c.equals(a)){
                    count++;
                }
            }
            
        }
        return count;
    }
}
