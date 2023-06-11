import java.util.*;

public class BS8 {
    public static int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        List<Integer> intersectList = new ArrayList<>();
        
        // Populate the frequency map with elements of nums1
        for (int num : nums1) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }
        
        // Find the intersection while considering frequencies
        for (int num : nums2) {
            if (freqMap.containsKey(num) && freqMap.get(num) > 0) {
                intersectList.add(num);
                freqMap.put(num, freqMap.get(num) - 1);
            }
        }
        
        // Convert the intersection list to an array
        int[] intersection = new int[intersectList.size()];
        int index = 0;
        
        for (int num : intersectList) {
            intersection[index] = num;
            index++;
        }
        
        return intersection;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};
        int[] intersection = intersect(nums1, nums2);
        
        for (int num : intersection) {
            System.out.print(num + " "); // Output: 2 2
        }
    }
}
