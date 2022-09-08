package dsaalab;

import java.math.BigInteger;
import java.util.Scanner;
public class Routes {
    public static void main(String[] args) {
        routes();
    }
    public static void routes() {
        Scanner in = new Scanner(System.in);
        int x0 = in.nextInt();
        int y0 = in.nextInt();
        int x1 = in.nextInt();
        int y1 = in.nextInt();
        int m = in.nextInt();
        int x = x1 - x0, y = y1 - y0;
        int s = Math.min(x, y), ma = Math.max(x, y);
        BigInteger bigInteger = new BigInteger("1");
        for (int i = 0; i < s; i++) {
            int max = ma + i + 1;
            BigInteger bigInteger1 = new BigInteger(String.valueOf(max));
            BigInteger bigInteger2 = new BigInteger(String.valueOf(i + 1));
            bigInteger = bigInteger.multiply(bigInteger1);
            bigInteger = bigInteger.divide(bigInteger2);
        }
        System.out.println(bigInteger);
        BigInteger bigInteger1 = new BigInteger(String.valueOf(m));
        BigInteger bigInteger3 = bigInteger.mod(bigInteger1);
        System.out.println(Integer.parseInt(String.valueOf(bigInteger3)));
    }
}
