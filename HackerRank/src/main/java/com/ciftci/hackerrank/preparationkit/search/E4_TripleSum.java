package com.ciftci.hackerrank.preparationkit.search;

import java.util.HashSet;
import java.util.Set;

public class E4_TripleSum {


    public static void main(String[] args) {

        int[] a = {1, 4, 5};
        int[] b = {2,3,3};
        int[] c = {1,2,3};

        long triplets = triplets(a, b, c);
    }

    static long triplets(int[] a, int[] b, int[] c) {
        Set<String> set = new HashSet<>();
        for (int i = 0; i< a.length;i++) {
            int valA = a[i];
            for (int j = 0; j < b.length; j++) {
                int valB = b[j];

                if (valA > valB) {
                    continue;
                }

                for (int z = 0; z < c.length; z++) {
                    int valC = c[z];

                    if (valB < valC) {
                        continue;
                    }

                    String s = valA + " " + valB + " " + valC;

                    set.add(s);
                }
            }
        }

        return set.size();

    }
}
