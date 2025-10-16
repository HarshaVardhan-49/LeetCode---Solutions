# Their are 2 type of logic on this problem with same Time and Space Complexity;

#1st with using 2 pointer at both sides of array
class Solution {
    public int removeElement(int[] nums, int val) {
        int i=0;
        int j=nums.length -1;
        while(i<=j){
            if(nums[i] != val) i++;
            else if(nums[j] == val) j--;
            else{
                int temp = nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
            }
        }
        return i;
    }
}

#2 Using 1 pointer with srtight approach 
class Solution {
    public int removeElement(int[] nums, int val) {
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }
}

Uses one pointer i to track the "next valid spot".

For each element nums[j], if it's not equal to val, move it forward.