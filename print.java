package dsaalab;

import java.util.Scanner;

public class print {
    public static void main(String[] args) {
        Print();
    }

    public static void Print() {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int height, width, length;
        for (int i = 0; i < num; i++) {
            length = input.nextInt();
            width = input.nextInt();
            height = input.nextInt();
            if (height >= width) {
                int dot = width * 2;
                int same = height - width + 1;
                for (int j = 0; j < dot; j++) {
                    for (int k = 0; k < dot - j; k++) {
                        System.out.print(".");
                    }
                    if ((dot - j) % 2 == 0) {
                        for (int l = 0; l < length * 2 + 1; l++) {
                            if (l % 2 == 0) {
                                System.out.print("+");
                            } else {
                                System.out.print("-");
                            }
                        }
                        for (int m = 0; m < j / 2; m++) {
                            System.out.print(".+");
                        }
                    } else {
                        for (int o = 0; o < length; o++) {
                            System.out.print("/.");
                        }
                        for (int p = 0; p < (j + 1) / 2; p++) {
                            System.out.print("/|");
                        }
                    }
                    System.out.println();
                }
                for (int j = 0; j < same * 2 - 1; j++) {
                    if (j % 2 == 0) {
                        for (int l = 0; l < length * 2 + 1; l++) {
                            if (l % 2 == 0) {
                                System.out.print("+");
                            } else {
                                System.out.print("-");
                            }
                        }
                        for (int k = 0; k < width; k++) {
                            System.out.print(".+");
                        }
                        System.out.println();
                    } else {
                        for (int k = 0; k < length; k++) {
                            System.out.print("|.");
                        }
                        for (int l = 0; l < width; l++) {
                            System.out.print("|/");
                        }
                        System.out.println("|");
                    }
                }
                for (int k = 0; k < dot; k++) {
                    if (k % 2 == 0) {
                        for (int j = 0; j < length; j++) {
                            System.out.print("|.");
                        }
                        for (int l = 0; l < (dot - k) / 2; l++) {
                            System.out.print("|/");
                        }
                        for (int d = 0; d < k + 1; d++) {
                            System.out.print(".");
                        }
                    } else {
                        for (int l = 0; l < length * 2 + 1; l++) {
                            if (l % 2 == 0) {
                                System.out.print("+");
                            } else {
                                System.out.print("-");
                            }
                        }
                        for (int s = 0; s < (dot - k) / 2; s++) {
                            System.out.print(".+");
                        }
                        for (int d = 0; d < k + 1; d++) {
                            System.out.print(".");
                        }

                    }
                     System.out.println();
                }
            } else {
                int dot = width * 2;
                for (int j = 0; j < dot - (width - height) * 2 + 1; j++) {
                    for (int k = 0; k < dot - j; k++) {
                        System.out.print(".");
                    }
                    if (j % 2 == 0) {
                        for (int l = 0; l < length * 2 + 1; l++) {
                            if (l % 2 == 0) {
                                System.out.print("+");
                            } else {
                                System.out.print("-");
                            }
                        }
                        for (int m = 0; m < j / 2; m++) {
                            System.out.print(".+");
                        }
                    } else {
                        for (int x = 0; x < length; x++) {
                            System.out.print("/.");
                        }
                        for (int c = 0; c < (j + 1) / 2; c++) {
                            System.out.print("/|");
                        }
                    }
                    System.out.println();
                }
                for (int k = 1; k < (width - height) * 2; k++) {
                    for (int m = 0; m < (width - height) * 2 - k; m++) {
                        System.out.print(".");
                    }
                    if (k % 2 == 1) {
                        for (int x = 0; x < length; x++) {
                            System.out.print("/.");
                        }
                        for (int x = 0; x < height; x++) {
                            System.out.print("/|");
                        }
                        System.out.print("/");
                    } else {
                        for (int l = 0; l < length * 2 + 1; l++) {
                            if (l % 2 == 0) {
                                System.out.print("+");
                            } else {
                                System.out.print("-");
                            }
                        }
                        for (int x = 0; x < (dot - (width - height) * 2) / 2; x++) {
                            System.out.print(".+");
                        }

                    }
                    for (int x = 0; x < k; x++) {
                        System.out.print(".");
                    }
                    System.out.println();
                }
                for (int j = 0; j < dot - (width - height) * 2 + 1; j++) {
                    if (j % 2 == 0) {
                        for (int l = 0; l < length * 2 + 1; l++) {
                            if (l % 2 == 0) {
                                System.out.print("+");
                            } else {
                                System.out.print("-");
                            }
                        }
                        for (int x = 0; x < (dot - (width - height) * 2 + 1 - j) / 2; x++) {
                            System.out.print(".+");
                        }
                        for (int m = 0; m < j + (width - height) * 2; m++) {
                            System.out.print(".");
                        }
                    } else {
                        for (int z = 0; z < length; z++) {
                            System.out.print("|.");
                        }
                        for (int m = 0; m < (dot - (width - height) * 2 + 1 - j) / 2; m++) {
                            System.out.print("|/");
                        }
                        for (int x = 0; x < j + (width - height) * 2; x++) {
                            System.out.print(".");
                        }
                    }
                    System.out.println();
                }

            }
        }
    }
}
