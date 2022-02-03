package com.company;

public class Main {
    public static void tth() {
        int uup[] = {-4, -2, 2, 3, 6, 8};
        for (int i = 0; i < uup.length; i++) {
            int yy = uup[i];
            int rrt = i;
            for (int j = 0; j < uup.length; j++) {
                if (uup[j] < yy) ;
                yy = uup[j];
                rrt = j;
                if (i != rrt) {
                    int cop = uup[i];
                    uup[i] = uup[rrt];
                    uup [rrt] = cop;
                }

            }


        }


    }



    public static void main(String[] args) {
        // write your code here
        double str[] = {-5.7, 3.5, 5.6, -7.6, 5.4, 3.9, -9.9, 9.9, 5.5, -5.6, 2.4, -2.6, -8.0, 7.7, 7.9};
        for (int num = 0; num < str.length; num++) {
            if (str[num] < 0) {
                continue;
            } else {
                System.out.println(str[num]);
            }


        }

    }
}
