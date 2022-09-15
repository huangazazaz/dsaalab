package dsaalab2;

import java.util.Scanner;

public class moonCake {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int snum = in.nextInt();
        int mnum = in.nextInt();
        int[] area = new int[mnum];
        for (int i = 0; i < mnum; i++) {
            area[i] = in.nextInt();
        }
        long max = 0;
        for (int i = 0; i < mnum; i++) {
            if (area[i] > max) max = area[i];
        }
        double left = 0.0, right = Math.PI * max*max, mid;
        while (left <= right - 1e-7) {
            mid = (left + right) / 2;
            int s = 0;
            for (double l : area) {
                s += Math.floor(l * l * Math.PI / mid);
            }
            if (s < snum) {
                right = mid;
            } else {
                left = mid;
            }
        }
        System.out.print(left);
    }
}
