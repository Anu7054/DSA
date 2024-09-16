/*
   Leetcode question link: https://leetcode.com/problems/binary-search/description/
*/

class Solution {
    public int search(int[] nums, int target) {
        int index = -1,length = nums.length;
        int start = 0,end = length - 1;
        while(end >= start){
            int mp = start + (end-start)/2;
            if(nums[mp] > target){
                end = mp - 1;
            }
            else if(nums[mp] < target){
                start = mp + 1;
            }
            else {
                index = mp;
                break;
            }
        }
        return index;
    }
}