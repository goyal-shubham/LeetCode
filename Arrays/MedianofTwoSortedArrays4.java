package Arrays;

/**
 * Created by shubham.goyal on 1/26/17.
 */
public class MedianofTwoSortedArrays4 {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int length1 = nums1.length;
        int length2 = nums2.length;

        int firstIndex = (length1 + length2 + 1) / 2;
        int secondIndex = (length1 + length2 + 2) / 2;

        if(firstIndex == secondIndex) {
            return (findKthElement(nums1, 0, nums2, 0, firstIndex));
        }
        return (findKthElement(nums1, 0, nums2, 0, firstIndex) + findKthElement(nums1, 0, nums2, 0, secondIndex)) / 2.0;

    }

    public int findKthElement(int[] nums1, int startA, int[] nums2, int startB, int k) {

        if(startA > nums1.length - 1) {
            return nums2[startB + k - 1];
        }
        if(startB > nums2.length - 1) {
            return nums1[startA + k - 1];
        }

        if (k == 1) {
            return Math.min(nums1[startA] , nums2[startB]);
        }

        int midA = Integer.MAX_VALUE, midB = Integer.MAX_VALUE;

        if(startA + k / 2 -1< nums1.length) {
            midA = nums1[startA + k/2 - 1];
        }
        if(startB + k / 2 - 1< nums2.length) {
            midB = nums2[startB + k / 2 - 1];
        }

        if(midA < midB) {
            return findKthElement(nums1, startA + k/2, nums2, startB, k - k / 2 );
        }
        else {
            return findKthElement(nums1, startA, nums2, startB + k / 2, k - k / 2 );
        }

    }
}
