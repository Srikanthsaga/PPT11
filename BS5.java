import java.util.*;

public class BS5 {
    public static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> intersectionSet = new HashSet<>();
        
        for (int num : nums1) {
            set.add(num);
        }
        
        for (int num : nums2) {
            if (set.contains(num)) {
                intersectionSet.add(num);
            }
        }
        
        int[] intersection = new int[intersectionSet.size()];
        int index = 0;
        
        for (int num : intersectionSet) {
            intersection[index] = num;
            index++;
        }
        
        return intersection;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};
        int[] intersection = intersection(nums1, nums2);
        
        for (int num : intersection) {
            System.out.print(num + " "); // Output: 2
        }
    }
}
