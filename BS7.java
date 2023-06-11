public class BS7 {
    public static int[] searchRange(int[] nums, int target) {
        int[] result = {-1, -1};
        int leftIndex = binarySearch(nums, target, true);
        
        if (leftIndex == nums.length || nums[leftIndex] != target) {
            return result;
        }
        
        result[0] = leftIndex;
        result[1] = binarySearch(nums, target, false) - 1;
        
        return result;
    }
    
    private static int binarySearch(int[] nums, int target, boolean left) {
        int leftPtr = 0;
        int rightPtr = nums.length;
        
        while (leftPtr < rightPtr) {
            int mid = leftPtr + (rightPtr - leftPtr) / 2;
            
            if (nums[mid] > target || (left && nums[mid] == target)) {
                rightPtr = mid;
            } else {
                leftPtr = mid + 1;
            }
        }
        
        return leftPtr;
    }

    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;
        int[] range = searchRange(nums, target);
        System.out.println(range[0] + " " + range[1]); // Output: 3 4
    }
}
