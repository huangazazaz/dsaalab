package dsaalab;

import java.util.Scanner;

public class AllIn {

    public static void main(String[] args) {
        System.out.println(allin());
    }

    public static String allin() {
        Scanner input = new Scanner(System.in);
        String dealer = input.next();
        for (int i = 0; i < 5; i++) {
            String my = input.next();
            if (dealer.charAt(0) == my.charAt(0)) return "All in";
            if (dealer.charAt(1) == my.charAt(1)) return "All in";
        }
        return "Fold";
    }



    //azazaz
}
