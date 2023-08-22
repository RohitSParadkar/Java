package BinaraySearch;
import java.util.Arrays;

class BSExample {
    public static void main(String[] args) {

        // int arr[]={1,2,3,10,13,17,18,19};
        // int target = 15;
        // System.out.println(ceilArray(arr,target));
        // System.out.println(floorArray(arr,target));

        int nums[] = { 5, 7, 7, 8, 8, 10 };
        int target = 8;
        int result[] = { -1, -1 };
        int start = search(nums, target, true);
        int end = search(nums, target, false);
        result[0] = start;
        result[1] = end;
        System.out.println(Arrays.toString(result));
    }

    // find the ceil element in array
    static int ceilArray(int arr[], int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return arr[start];
    }

    static int floorArray(int arr[], int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return arr[end];
    }

    // find-first-and-last-position-of-element-in-sorted-array
    static int search(int[] ls, int target, boolean firstIndex) {
        int start = 0;
        int end = ls.length - 1;
        int ans = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < ls[mid]) {
                end = mid - 1;
            } else if (target > ls[mid]) {
                start = mid + 1;
            } else {
                ans = mid;
                if (firstIndex) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }



}
