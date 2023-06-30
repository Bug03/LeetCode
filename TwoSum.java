public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        // n: nums.size;
        // for (i -> n)
        // for (j -> n-i +1) j= i + 1; j++
        int result[] = new int[2];
        int size = nums.length; // 3
        int index = 0;
        for (int i = 0; i < size;i++) {
            for (int j = i +1; j < size ;j++) {
                if (nums[i] + nums[j] == target) {
                    result[index] = i;
                    ++index;
                    result[index] = j;
                    ++index;
                }
            }
        }
        return result;
    }
}
