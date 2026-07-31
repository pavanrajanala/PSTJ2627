class Solution {
    public int[] sortedSquares(int[] nums) {
        int l=0;
        int index=nums.length-1;
        int r = nums.length-1;
        int [] result = new int[nums.length];
        while(l<=r){
            int ls = nums[l]*nums[l];
            int rs = nums[r]*nums[r];
            if(ls>rs){
                result[index]=ls;
                l++;
                index--;

            }
            else{
                result[index]=rs;
                r--;
                index--;
            }
        }
        return result;

    }
}
