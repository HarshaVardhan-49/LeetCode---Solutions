class Solution {
    private void swap(int [] nums, int a, int b){
        int temp = nums[a];
        nums[a]=nums[b];
        nums[b]=temp;
    }
    public void sortColors(int[] nums) {
        int i = 0;
        int low = 0;
        int high = nums.length -1;

        while(i<=high){
            if(nums[i] == 2){
                swap(nums,i,high);
                high --;
            }
            else if(nums[i] == 1){
                i++;
            }
            else if(nums[i] == 0){
                swap(nums,i,low);
                low++;
                i++;
            }
        }
    }
}