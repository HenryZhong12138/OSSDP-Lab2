import java.util.List;
import java.util.Scanner;

public class LargestDivisibleSubsetTest {
    public static void main(String[] args) {
        LargestDivisibleSubsetTest test = new LargestDivisibleSubsetTest();
        test.testLargestDivisibleSubset();

        //随意测试
        int nums[] = {1,2,4,8,16,32,64,99,10,23,24,25};
        test.testLargestDivisibleSubset2(nums);
    }

    //题目中的测试
    public void testLargestDivisibleSubset() {
        Solution3 solution = new Solution3();
        int[] nums1 = {1, 2, 3};
        List<Integer> result1 = solution.largestDivisibleSubset(nums1);
        result1.sort(Integer::compareTo);
        System.out.println("Test Case 1: " + result1); // 期望输出 [1, 2]

        int[] nums2 = {1, 2, 4, 8};
        List<Integer> result2 = solution.largestDivisibleSubset(nums2);
        result2.sort(Integer::compareTo);
        System.out.println("Test Case 2: " + result2); // 期望输出 [1, 2, 4, 8]
    }

    //随意测试
    public void testLargestDivisibleSubset2(int nums[]) {
        Solution3 solution = new Solution3();
        List<Integer> result = solution.largestDivisibleSubset(nums);
        result.sort(Integer::compareTo);
        System.out.println("Test Case: " + result);
    }
}
