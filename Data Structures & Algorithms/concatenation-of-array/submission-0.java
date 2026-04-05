class Solution {
    public int[] getConcatenation(int[] nums) {
        
        int n = nums.length;
        int x  = 2;
        int [] ans = new int [x*n];
        int a = 0; 

        for(int i = 0; i < x;i++){
            for ( int num : nums){
                ans[a++]= num;
            }
        }
          
          return ans;

    }
}