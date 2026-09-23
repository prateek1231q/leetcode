class Solution {
    public void sortColors(int[] nums) {
      int c0=0;
      int c2=0;
      int c3 =0;

        for(int i=0;i<nums.length;i++){
           
            if(nums[i]==0){
             
                c0++;
            }
            else if(nums[i]==1){
               
                c2++;
            }
            else if(nums[i]==2){
                
                c3++;
            }
            }
            int i=0;
            while(c0>0){
                nums[i]=0;
                i++;
                c0--;
            }
            while(c2>0){
                nums[i]=1;
                i++;
                c2--;

        }while(c3>0){
                nums[i]=2;
                i++;
                c3--;

    }}}
