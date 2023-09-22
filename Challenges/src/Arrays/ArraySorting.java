package Arrays;

import java.util.Arrays;

public class ArraySorting {
    public static void main(String[] args) {
        int[] arrayToBeSorted = {28, 133, 52, 567, 88, 1009};
        ArraySorter(arrayToBeSorted);

    }

    public static void ArraySorter(int[] nums) {
        System.out.println("Before sorting: " + Arrays.toString(nums));
        // start at index 0 and compare left
        boolean flag = true;
        while (flag) {
            flag = false;
            for (int i = 1; i < nums.length; i++) {
                int temp;
                if (nums[i] > nums[i - 1]) {
                    System.out.println("swap " + nums[i] + " and " + nums[i - 1]);
                    temp = nums[i];
                    nums[i] = nums[i - 1];
                    nums[i - 1] = temp;
                    System.out.println(Arrays.toString(nums));
                    flag = true;
                }
            }
        }
        System.out.println("After sorting: " + Arrays.toString(nums));

    }
}
