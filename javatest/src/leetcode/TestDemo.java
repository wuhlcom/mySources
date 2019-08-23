package leetcode;
public class TestDemo {
    static class Solution {
        public static int[] twoSum(int[] nums, int target) throws Exception {
            for (int i = 0; i < nums.length; i++) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (target == nums[i] + nums[j]) {
                        return new int[]{i, j};
                    }
                }
            }

            throw new Exception("No two sum solution");
        }

    }



    public static void main(String[] args) throws Exception {
        int[] nums ={2,3,4,5,6,7};
        System.out.println("-----------result-------------");
        System.out.println(TestDemo.Solution.twoSum(nums,9)[0]);
        System.out.println(TestDemo.Solution.twoSum(nums,9)[1]);

    }
}