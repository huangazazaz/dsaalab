//package dsaalab2;
//
//import java.util.Scanner;
//
//public class simpleTest {
//    public static void main(String[] args) {
//        search();
//    }
//
//    public static void search() {
//        Scanner in = new Scanner(System.in);
//        int num = in.nextInt();
//        int qnum = in.nextInt();
//        int[] arr = new int[num];
//        int[] nums = new int[qnum];
//        boolean[] b = new boolean[qnum];
//        for (int i = 0; i < num; i++) {
//            arr[i] = in.nextInt();
//        }
//        big:
//        for (int i = 0; i < qnum; i++) {
//            int x = in.nextInt();
//            int y = in.nextInt();
//            int left = 0, right = num - 1;
//            while (arr[left] <= x) {
//                left++;
//                if (left == num - 1) {
//                    System.out.println("NO");
//                    continue big;
//                }
//            }
//            while (arr[right] >= y) {
//                right--;
//                if (right == 0){
//                    System.out.println("NO");
//                    continue big;
//                }
//            }
//            if (left > right) {
//                System.out.println("NO");
//            } else {
//                int a = right - left + 1;
//                System.out.println("YES " + a);
//            }
//        }
//    }
//}
