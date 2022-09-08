package dsaalab;

import java.util.Arrays;
import java.util.Scanner;

public class Mahhjong {
    public static void main(String[] args) {
        win();
    }

    public static void win() {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        boolean[] n = new boolean[num];
        in.nextLine();
        for (int i = 0; i < num; i++) {
            String string = in.nextLine();
            char[] chars = string.toCharArray();
            int[] charsz = new int[9];
            int[] charss = new int[9];
            int[] charsb = new int[9];
            int[] charsw = new int[9];
//            for (int h = 0; h < 9; h++) {
//                charss[h] = 0;
//                charsb[h] = 0;
//                charsz[h] = 0;
//                charsw[h] = 0;
//            }
            int z = 0, s = 0, b = 0, w = 0, q = 0;
            for (int l = 0; l < 14; l++) {
                if (chars[2 * l + 1] == 'z') {
                    charsz[chars[2 * l] - 49] += 1;
                    z++;
                }
                if (chars[2 * l + 1] == 'b') {
                    charsb[chars[2 * l] - 49] += 1;
                    b++;
                }
                if (chars[2 * l + 1] == 'w') {
                    charsw[chars[2 * l] - 49] += 1;
                    w++;
                }
                if (chars[2 * l + 1] == 's') {
                    charss[chars[2 * l] - 49] += 1;
                    s++;
                }
            }
            if (s % 3 == 2) q++;
            if (w % 3 == 2) q++;
            if (b % 3 == 2) q++;
            if (z % 3 == 2) q++;
            boolean[] win = new boolean[4];
            win[0] = win(charss, s, false);
            win[1] = win(charsw, w, false);
            win[3] = win(charsb, b, false);
            win[2] = win(charsz, z, true);
            boolean t = true;
            for (int a = 0; a < 4; a++) {
                t = t && win[a];
            }
            n[i] = t && q == 1;
        }
        for (int i = 0; i < num; i++) {
            if (n[i]) {
                System.out.println("Blessing of Heaven");
            } else {
                System.out.println("Bad luck");
            }
        }
    }

    public static boolean win(int[] charss, int a, boolean tt) {
        int[] chars = Arrays.copyOf(charss, charss.length);
        if (a % 3 == 0) {
            for (int i = 0; i < 9; ) {
                switch ((chars[i]) % 3) {
                    case 0 -> i++;
                    case 1 -> {
                        if (tt) return false;
                        if (i + 1 < 9 && chars[i + 1] > 0 && i + 2 < 9 && chars[i + 2] > 0) {
                            chars[i + 1] -= 1;
                            chars[i + 2] -= 1;
                            i++;
                        } else {
                            return false;
                        }
                    }
                    case 2 -> {
                        if (tt) return false;
                        if (i + 1 < 9 && chars[i + 1] > 1 && i + 2 < 9 && chars[i + 2] > 1) {
                            chars[i + 1] -= 2;
                            chars[i + 2] -= 2;
                            i++;
                        } else {
                            return false;
                        }
                    }
                }
            }
        } else if (a % 3 == 2) {
            int x = 0;
            int[] d = new int[9];
            for (int i = 0; i < 9; i++) {
                if (chars[i] > 1) {
                    d[x] = i;
                    x++;
                }
            }
            boolean[] tu = new boolean[x];
            for (int z = 0; z < x; z++) {
                chars[d[z]] -= 2;
                tu[z] = win(chars, a - 2, tt);
                chars[d[z]] += 2;
            }
            boolean t = false;
            for (int i = 0; i < x; i++) {
                t = t || tu[i];
            }
            return t;
        } else {
            return false;
        }
        return true;
    }
}
//            int s = 0, que = 0, t = 0;
//            for (int j = 0; j < 14; ) {
//                int k = 2 * j;
//                if (k + 3 < 28 && chars[k + 1] == chars[k + 3]) {
//                    if (chars[k] == chars[k + 2]) {
//                        if (k + 5 < 28 && chars[k] == chars[k + 4] && chars[k + 1] == chars[k + 5]) {
//                            j += 3;
//                            t++;
//                        } else {
//                            j += 2;
//                            que++;
//                        }
//                    } else if (chars[k] == chars[k + 2] - 1 && chars[k + 1] != 'z') {
//                        if (k + 5 < 28 && chars[k] == chars[k + 4] - 2 && chars[k + 1] == chars[k + 5]) {
//                            j += 3;
//                            s++;
//                        } else {
//                            n[i] = false;
//                            continue big;
//                        }
//                    } else {
//                        n[i] = false;
//                        continue big;
//                    }
//                } else {
//                    n[i] = false;
//                    continue big;
//
//                }
//            }
//            n[i] = que == 1 && t + s == 4;
