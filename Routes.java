package dsaalab;


import java.math.BigInteger;
import java.util.Scanner;

public class Routes {
    public static void main(String[] args) {
        routes();
//        System.out.println(combinatorial(2000, 1000, 5));
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
//        double route = 1;
        for (int i = 0; i < s; i++) {
            int max = ma + i + 1;
            BigInteger bigInteger1 = new BigInteger(String.valueOf(max));
            BigInteger bigInteger2 = new BigInteger(String.valueOf(i + 1));
            bigInteger = bigInteger.multiply(bigInteger1);
            bigInteger = bigInteger.divide(bigInteger2);
//            route *= ma + i + 1;
//            route /= i + 1;
        }
        System.out.println(bigInteger);
        BigInteger bigInteger1 = new BigInteger(String.valueOf(m));
        BigInteger bigInteger3 = bigInteger.mod(bigInteger1);
        System.out.println(Integer.parseInt(String.valueOf(bigInteger3)));
//        String st = String.valueOf(route % m);
//        StringBuilder stringBuilder = new StringBuilder();
//        for (int i = 0; i < st.length() - 2; i++) {
//            stringBuilder.append(st.charAt(i));
//        }
//        st = stringBuilder.toString();
//        int result = combinatorial(x + y, s, m);
//        System.out.print(result);
    }

//    public static int combinatorial(int i, int j, int m) {
//        System.out.print("c");
//        int num = 1;
//        if (i < 50 || j < 50) {
//            for (int k = 0; k < j; k++) {
//                num *= i - j + k + 1;
//                num /= k + 1;
//            }
//            return num % m;
//        } else {
//            return (combinatorial(i - 1, j - 1, m) + combinatorial(i - 1, j, m)) % m;
//        }
//    }
}
