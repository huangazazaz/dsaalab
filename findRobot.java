package dsaalab2;

import java.util.Scanner;

public class findRobot {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long xr = in.nextInt(), yr = in.nextInt(), xc = in.nextInt(), yc = in.nextInt();
        long xl = 0, yl = 0;
        long time = 0;
        int len = in.nextInt();
        in.nextLine();
        String intra = in.nextLine();
        char[] instructions = intra.toCharArray();
        for (int i = 0; i < len; i++) {
            switch (instructions[i]) {
                case 'U' -> yl++;
                case 'D' -> yl--;
                case 'L' -> xl--;
                case 'R' -> xl++;
            }
        }
        long co = len - xl * (xr - xc >= 0 ? 1 : -1) - yl * (yr - yc >= 0 ? 1 : -1);
        for (int i = 1; i < len + 1; i++) {
            switch (instructions[i - 1]) {
                case 'U' -> yr++;
                case 'D' -> yr--;
                case 'L' -> xr--;
                case 'R' -> xr++;
            }
            long l = Math.abs(yr - yc) + Math.abs(xr - xc);
            if (l <= i) {
                System.out.println(i);
                return;
            } else {
                if (co <= 0) {
                    System.out.println("-1");
                    return;
                } else {
                    long times;
                    long col = (l - i) / co;
                    if (l - col * co <= i) {
                        times = i + col * len;
                    } else {
                        times = i + col * len + len;
                    }
                    if (time == 0) {
                        time = times;
                    } else {
                        time = Math.min(times, time);

                    }
                }
            }
        }
        System.out.print(time);
    }
}
//222