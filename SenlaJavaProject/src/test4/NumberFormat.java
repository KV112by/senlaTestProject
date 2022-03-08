package test4;

import java.util.Scanner;

public class NumberFormat {

    /*Создайте программу, которая будет получать число и печатать его в следующем формате
     (формы цифр можно придумать свои, главное, чтобы они читались на экране)*/
    public static int MAX_NUMBER = 0;
    public static String STAR = "*";
    public static String SPACE = " ";
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Введите число: ");
        int myNumber = sc1.nextInt();
        String s = Integer.toString(myNumber);
        sc1.close();
        int [] digitArray = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            digitArray[s.length() - 1 - i] = myNumber % 10;
            MAX_NUMBER = Math.max(MAX_NUMBER, myNumber % 10);
            myNumber = myNumber / 10;
        }
        digitCheck(digitArray);



    }
    public static void digitCheck (int[] x) {
        StringBuilder[] sb = new StringBuilder[5];
        for (int i = 0; i < sb.length; i++) {
            sb[i] = new StringBuilder("");
        }

        for (int k : x) {
            switch (k) {
                case 1 -> {
                    for (int i = 0; i < sb.length; i++) {
                        for (int j = 0; j < 3; j++) {
                            if (k == MAX_NUMBER) {
                                STAR = Integer.toString(k);
                            }
                            if (j == 0 && i != 1) {
                                sb[i].append(SPACE);
                            } else if (j == 2) {
                                sb[i].append(SPACE);
                            } else {
                                sb[i].append(STAR);
                            }

                        }
                    }
                    STAR = "*";
                }
                case 2 -> {
                    for (int i = 0; i < sb.length; i++) {
                        for (int j = 0; j < 3; j++) {
                            if (k == MAX_NUMBER) {
                                STAR = Integer.toString(k);
                            }
                            if (j == 0 && i == 1) {
                                sb[i].append(SPACE);
                            } else if (j == 1 && i == 3) {
                                sb[i].append(SPACE);
                            } else if (j == 2) {
                                sb[i].append(SPACE);
                            } else {
                                sb[i].append(STAR);
                            }

                        }
                    }
                    STAR = "*";
                }
                case 3 -> {
                    for (int i = 0; i < sb.length; i++) {
                        for (int j = 0; j < 3; j++) {
                            if (k == MAX_NUMBER) {
                                STAR = Integer.toString(k);
                            }
                            if (j == 0 && i == 1) {
                                sb[i].append(SPACE);
                            } else if (j == 0 && i == 3) {
                                sb[i].append(SPACE);
                            } else if (j == 2) {
                                sb[i].append(SPACE);
                            } else {
                                sb[i].append(STAR);
                            }

                        }
                    }
                    STAR = "*";
                }
                case 4 -> {
                    for (int i = 0; i < sb.length; i++) {
                        for (int j = 0; j < 4; j++) {
                            if (k == MAX_NUMBER) {
                                STAR = Integer.toString(k);
                            }
                            if (j == 0 && (i == 4 || i == 3)) {
                                sb[i].append(SPACE);
                            } else if (j == 1 && i != 2) {
                                sb[i].append(SPACE);
                            } else if (j == 3) {
                                sb[i].append(SPACE);
                            } else {
                                sb[i].append(STAR);
                            }

                        }
                    }
                    STAR = "*";
                }
                case 5 -> {
                    for (int i = 0; i < sb.length; i++) {
                        for (int j = 0; j < 4; j++) {
                            if (k == MAX_NUMBER) {
                                STAR = Integer.toString(k);
                            }
                            if (i == 1 && (j == 1 || j == 2)) {
                                sb[i].append(SPACE);
                            } else if (i == 3 && (j == 0 || j == 1)) {
                                sb[i].append(SPACE);
                            } else if (j == 3) {
                                sb[i].append(SPACE);
                            } else {
                                sb[i].append(STAR);
                            }

                        }
                    }
                    STAR = "*";
                }
                case 6 -> {
                    for (int i = 0; i < sb.length; i++) {
                        for (int j = 0; j < 4; j++) {
                            if (k == MAX_NUMBER) {
                                STAR = Integer.toString(k);
                            }
                            if (j == 1 && (i == 1 || i == 3)) {
                                sb[i].append(SPACE);
                            } else if (i == 1 && j == 2) {
                                sb[i].append(SPACE);
                            } else if (j == 3) {
                                sb[i].append(SPACE);
                            } else {
                                sb[i].append(STAR);
                            }

                        }
                    }
                    STAR = "*";
                }
                case 7 -> {
                    for (int i = 0; i < sb.length; i++) {
                        for (int j = 0; j < 4; j++) {
                            if (k == MAX_NUMBER) {
                                STAR = Integer.toString(k);
                            }
                            if (i == 1 && j < 2) {
                                sb[i].append(SPACE);
                            } else if (i == 2 && j < 2) {
                                sb[i].append(SPACE);
                            } else if (i == 3 && j != 1) {
                                sb[i].append(SPACE);
                            } else if (i == 4 && j != 0) {
                                sb[i].append(SPACE);
                            } else if (j == 3) {
                                sb[i].append(SPACE);
                            } else {
                                sb[i].append(STAR);
                            }

                        }
                    }
                    STAR = "*";
                }
                case 8 -> {
                    for (int i = 0; i < sb.length; i++) {
                        for (int j = 0; j < 4; j++) {
                            if (k == MAX_NUMBER) {
                                STAR = Integer.toString(k);
                            }
                            if ((i == 1 || i == 3) && j == 1) {
                                sb[i].append(SPACE);

                            } else if (j == 3) {
                                sb[i].append(SPACE);
                            } else {
                                sb[i].append(STAR);
                            }

                        }
                    }
                    STAR = "*";
                }
                case 9 -> {
                    for (int i = 0; i < sb.length; i++) {
                        for (int j = 0; j < 4; j++) {
                            if (k == MAX_NUMBER) {
                                STAR = Integer.toString(k);
                            }
                            if (i == 1 && j == 1) {
                                sb[i].append(SPACE);
                            } else if (i == 3 && j < 2) {
                                sb[i].append(SPACE);
                            } else if (j == 3) {
                                sb[i].append(SPACE);
                            } else {
                                sb[i].append(STAR);
                            }

                        }
                    }
                    STAR = "*";
                }
                case 0 -> {
                    for (int i = 0; i < sb.length; i++) {
                        for (int j = 0; j < 4; j++) {
                            if (k == MAX_NUMBER) {
                                STAR = Integer.toString(k);
                            }
                            if (i == 1 && j == 1) {
                                sb[i].append(SPACE);
                            } else if (i == 2 && j == 1) {
                                sb[i].append(SPACE);
                            } else if (i == 3 && j == 1) {
                                sb[i].append(SPACE);
                            } else if (j == 3) {
                                sb[i].append(SPACE);
                            } else {
                                sb[i].append(STAR);
                            }

                        }
                    }
                    STAR = "*";
                }
            }
        }
        for (StringBuilder s : sb) {
            System.out.println(s.toString());
        }

    }

}
