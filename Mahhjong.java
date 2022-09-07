package dsaalab;

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
        big:
        for (int i = 0; i < num; i++) {
            String string = in.nextLine();
            char[] chars = string.toCharArray();
//            for (int x = 0; x < 28; x++) {
//                chars[x] = string.charAt(x);
//            }
            int s = 0, que = 0, t = 0;
            for (int j = 0; j < 14; ) {
                int k = 2 * j;
                if (k + 3 < 28 && chars[k + 1] == chars[k + 3]) {
                    if (chars[k] == chars[k + 2]) {
                        if (k + 5 < 28 && chars[k] == chars[k + 4] && chars[k + 1] == chars[k + 5]) {
                            j += 3;
                            t++;
                        } else {
                            j += 2;
                            que++;
                        }
                    } else if (chars[k] == chars[k + 2] - 1 && chars[k + 1] != 'z') {
                        if (k + 5 < 28 && chars[k] == chars[k + 4] - 2 && chars[k + 1] == chars[k + 5]) {
                            j += 3;
                            s++;
                        } else {
                            n[i] = false;
                            continue big;
                        }
                    } else {
                        n[i] = false;
                        continue big;
                    }
                }
            }
            n[i] = que == 1 && t + s == 4;
        }
        for (int i = 0; i < num; i++) {
            if (n[i]) {
                System.out.print("Blessing of Heaven\n");
            } else {
                System.out.print("Bad luck\n");
            }
        }
    }
}
