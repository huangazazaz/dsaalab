package dsaalab2;

import java.util.Scanner;

public class Count {

    public static void main(String[] args) {
        counting();
    }


    public static void counting() {
        Scanner in = new Scanner(System.in);
//        for (int x = 0; x < 1000; x++) {
        int n = in.nextInt();
        int target = in.nextInt();
        int[] arr = new int[n];
        long num = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        big:
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1, k = n - 1; j < k; ) {
                if (arr[i] + arr[j] + arr[k] == target) {
                    if (arr[j] == arr[k]) {
                        num += (long) (k - j) * (k - j + 1) / 2;
                        continue big;
                    } else {
                        int kk = 1, jj = 1;
                        while (arr[k] == arr[k - 1] && k - 1 > j) {
                            kk++;
                            k--;
                        }
                        while (arr[j] == arr[j + 1] && k - 1 > j) {
                            jj++;
                            j++;
                        }
                        num += (long) jj * kk;
                        j++;
                    }
                } else if (arr[i] + arr[j] + arr[k] > target) {
                    k--;
                } else {
                    j++;
                }
            }
        }
        System.out.print(num);
    }
//    }
}
