package dsaalab2;

import java.util.Scanner;

public class simple {
    public static void main(String[] args) {
        SimpleSearch();
    }
    public static void SimpleSearch() {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int qnum = in.nextInt();
        int[] arr = new int[num];
        int[] nums = new int[qnum];
        boolean[] b = new boolean[qnum];
        for (int i = 0; i < num; i++) {
            arr[i] = in.nextInt();
        }
        for (int i = 0; i < qnum; i++) {
            int x = in.nextInt();
            int y = in.nextInt();
            if (x >= y - 1) {
                b[i] = true;
                continue;
            }
            int left = searchLeft(arr, x);
            int right = searchRight(arr, y);
            nums[i] = right - left - 1;
            b[i] = left == -2 || right == -2 || right <= left;
        }
        for (int i = 0; i < qnum; i++) {
            if (b[i] || nums[i] == 0) {
                System.out.println("NO");
            } else {
                System.out.println("YES " + nums[i]);
            }

        }
    }
    public static int searchLeft(int[] nums, int target) {
        int left = 0, right = nums.length - 1, mid;
        while (left <= right) {
            mid = left + (right - left) / 2;
            if (nums[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return right;
    }
    public static int searchRight(int[] nums, int target) {
        int left = 0, right = nums.length - 1, mid;
        while (left <= right) {
            mid = left + (right - left + 1) / 2;
            if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }
}
