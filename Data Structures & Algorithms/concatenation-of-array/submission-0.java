class Solution {
    public int[] getConcatenation(int[] nums) {
        int []out =new int[2*nums.length];
        int j=0;
       for(int i:nums){
        out[j]=i;
        out[j+nums.length]=i;
        j++;
       } 
       return out;
    }
    
}