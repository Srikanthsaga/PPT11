public class BS4 {
    public static int findDuplicate(int[] nums) {
        int tortoise = nums[0];
        int hare = nums[0];

        // Phase 1: Find the intersection point of the two pointers
        do {
            tortoise = nums[tortoise];
            hare = nums[nums[hare]];
        } while (tortoise != hare);

        // Phase 2: Find the starting point of the cycle
        tortoise = nums[0];
        while (tortoise != hare) {
            tortoise = nums[tortoise];
            hare = nums[hare];
        }

        return hare;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 4, 2, 2};
        int repeatedNumber = findDuplicate(nums);
        System.out.println(repeatedNumber); // Output: 2
    }
}
