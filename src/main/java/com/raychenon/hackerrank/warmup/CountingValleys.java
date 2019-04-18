package com.raychenon.hackerrank.warmup;

/**
 * User: raychenon
 * Date: 16/4/19
 * https://www.hackerrank.com/challenges/counting-valleys/problem
 */
public class CountingValleys {

    static int countingValleys(int n, String s) {
        
        //  A valley is a sequence of consecutive steps below sea level,
        //  starting with a step down from sea level and ending with a step up to sea level.
        //      _/\      _
        //         \    /
        //          \/\/

        int nbValleys = 0;
        int level = 0;
        boolean wasBelowSeaLevel = false;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            level = level + valueOfStep(c);
            if (level < 0) {
                wasBelowSeaLevel = true;
            }

            if (wasBelowSeaLevel && level >= 0) {
                nbValleys++;
                wasBelowSeaLevel = false;
            }

        }
        return nbValleys;
    }

    private static int valueOfStep(Character c) {
        switch (c) {
            case 'U':
                return -1;
            case 'D':
                return +1;
            default:
                return 0;
        }
    }
}
