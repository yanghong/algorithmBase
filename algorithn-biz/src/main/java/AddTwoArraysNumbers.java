/**
 * @author hunter.yang
 * @version 1.0
 * @description null
 * @date 2019/8/13 10:16
 */
public class AddTwoArraysNumbers {
        private static int[] twoSum(int[] nums, int target) {
            int[] result = new int[2];

            if (null == nums) {
                throw new IllegalArgumentException("输入数组不能为空");
            }
            for (int i = 0; i<nums.length;i++) {
                for (int j = 0; j<nums.length; j++) {
                    if (i!=j && target == nums[i] + nums[j]) {
                        result[0] = i;
                        result[1] = j;
                        return result;
                    }
                }
            }
            return result;
        }
        
        public static void main(String[] args) {
            int[] nums = {};
            int target = 9;
            System.out.println(twoSum(nums,target));
        }
}
