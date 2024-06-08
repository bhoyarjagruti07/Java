class Solution {
    public int search(int[] a, int target) {
        int low = 0;
        int high = a.length - 1;

        while (high >= low) {
            int mid = (low + high) / 2;

            // Check if mid is the target
            if (target == a[mid]) {
                return mid;
            }

            // Check if the left side is sorted
            if (a[low] <= a[mid]) {
                // Check if target is within the left portion
                if (target >= a[low] && target < a[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
            // The right side must be sorted
            else {
                // Check if target is within the right portion
                if (target > a[mid] && target <= a[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }

        // Target not found
        return -1;
    }
}
