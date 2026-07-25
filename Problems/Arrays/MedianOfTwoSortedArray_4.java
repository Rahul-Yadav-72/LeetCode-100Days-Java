package Problems.Arrays;

public class MedianOfTwoSortedArray_4 {

    public static void main(String[] args) {

        int[] nums1 = {1, 3};
        int[] nums2 = {2};

        int[] ans = new int[nums1.length + nums2.length];

        int p1 = 0, p2 = 0, p3 = 0;

        while (p1 < nums1.length || p2 < nums2.length) {

            int val1 = (p1 < nums1.length) ? nums1[p1] : Integer.MAX_VALUE;
            int val2 = (p2 < nums2.length) ? nums2[p2] : Integer.MAX_VALUE;

            if (val1 < val2) {
                ans[p3++] = val1;
                p1++;
            } else {
                ans[p3++] = val2;
                p2++;
            }
        }

        double median;

        if (ans.length % 2 == 0) {
            median = (ans[ans.length / 2] + ans[ans.length / 2 - 1]) / 2.0;
        } else {
            median = ans[ans.length / 2];
        }

        System.out.println("Median = " + median);
    }
}