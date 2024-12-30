/**
 * Time Complexity: O(log N)
 * 
 * Space Complexity: O(1)
 */

class Problem1 {

  public int findMissingInSortedArray(int[] nums) {
    if (nums[0] != 1) {
      return 1;
    }
    if (nums[nums.length - 1] != (nums.length + 1)) {
      return nums.length + 1;
    }

    int low = 0;
    int high = nums.length - 1;
    while (low <= high) {
      int mid = low + (high - low) / 2;
      if (nums[mid] != mid + 1 && nums[mid - 1] == mid) {
        return mid + 1;
      }
      if ((nums[mid] - mid) != (nums[low] - low)) {
        high = mid - 1;
      } else {
        low = mid + 1;
      }
    }
    return -1;
  }
}