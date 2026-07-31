class SortArrayByParity {
    public int[] sortArrayByParity(int[] nums) {
       int left=0;
       int right = nums.length-1;
       while(left<right){
             if(nums[left]%2> nums[right]%2){
                    int k = nums[left];
                    nums[left]=nums[right];
                    nums[right]=k;
             }
             if(nums[left]%2==0){
                left++;
             }
             if(nums[right]%2==1){
                right --;
             }
       }
       return nums;
    }
}
