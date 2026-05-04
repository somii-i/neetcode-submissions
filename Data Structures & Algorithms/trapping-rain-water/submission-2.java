class Solution {
    public int trap(int[] height) {

        if(height==null || height.length==0 ){
            return 0;
        }

       int l=0, r = height.length-1;
       int res =0;
       int leftM = height[l], rightM=height[r];

       while(l<r){
        if(leftM < rightM){
            l++;
            leftM = Math.max(leftM, height[l]);
            res += leftM - height[l];
        }
        else{
            r--;
            rightM = Math.max(rightM, height[r]);
            res += rightM - height[r];
        }
       }
       return res;
        
    }
}
