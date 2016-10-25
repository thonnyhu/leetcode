package leetcode.first;

/**
 * Created by Mirana on 2016-10-25.
 */
public class Solution {
    public static void main(String[] args) {

    }
    public int[] twoSum(int[] nums,int target){
        //1级过滤
        /*
        int[] copy = new int[nums.length];
        //不能加过滤，会导致无序数组散列，无法进行
        for(int i=0;i<nums.length;i++){
            if(nums[i]<target)
                copy[i] = nums[i];
        }*/
        int[] answer = new int[2];
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(target-nums[i]==nums[j]){
                    answer[0] = i;
                    answer[1] = j;
                }
            }
        }
        return answer;
    }
}
