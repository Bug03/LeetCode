public class TwoSumUpdate {
    public int[] twoSum(int[] nums, int target) {
        // n: nums.size;
        // for (i -> n)
        // for (j -> n-i +1) j= i + 1; j++
        // int result[] = new int[2];
        // [3,2,6] => 9
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length;i++) {
            int remain = target- nums[i];
            if (map.containsKey(remain)) {
                return new int []{map.get(remain),i};
            }
            else {
                map.put(nums[i], i);
            }
        }
        return new int []{0,0};
    }
}
