package dsaalab2;

import java.util.Random;

public class TestDate {
    public static void main(String[] args) {
        date();
    }


    public static void date() {
        Random random = new Random();
        int num = random.nextInt(1000) + 1;
        System.out.print(num + " ");
        int snum = random.nextInt(1000) + 1;
        System.out.println(snum);
//        int[] arr = new int[num];
//        int i = 1;
//        arr[0] = random.nextInt(100);
//        System.out.print(arr[0] + " ");
//        while (i < num) {
//            arr[i] = arr[i - 1] + random.nextInt(10000);
//            System.out.print(arr[i] + " ");
//            i++;
//        }
        for (int i = 0; i < num; i++) {
            System.out.print(random.nextInt(1000) + 1 + " ");
        }

    }
}
//package dsaalab2;
