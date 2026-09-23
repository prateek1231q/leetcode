class Solution {
    public int maxProduct(int[] nums) {
        int product=1;
        int max=nums[0];
        for(int i=0;i<nums.length;i++){
            product=1;
              for(int j=i;j<nums.length;j++){
                product=product*nums[j];
                if(product>max){
                    max=product;
                }


              }
             

        } return max;
    }
}