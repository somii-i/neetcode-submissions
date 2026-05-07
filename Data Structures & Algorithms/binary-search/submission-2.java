class Solution {
    public int search(int[] nums, int target) {
        
        int low = 0, hi = nums.length-1, mid = (low + hi)/2;
        while(low <= hi){
            if(nums[mid] == target){
                return mid;
            }
            else if(nums[mid] < target){
                low = mid+1;
            }
            else if(nums[mid] > target){
                hi = mid-1;
            }
            mid = (low + hi)/2;
        }
        return -1;
    }
}
