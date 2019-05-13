package com.raychenon.hackerrank.warmup;

import java.util.List;
import java.util.stream.IntStream;

/**
 * User: raychenon
 * Date: 2019-05-11
 * https://www.hackerrank.com/challenges/bon-appetit/problem
 */
public class BonAppetit {

    String calculateBillCharged(List<Integer> bill, int indexNotBilled, int amountCollected) {

        int amount = 0;
        int i = 0;
        amount = IntStream.range(0, bill.size())
                .filter(e -> bill.get(e) != bill.get(indexNotBilled))
                .map(x -> bill.get(x))
                .sum();

//        while (i < bill.size()) {
//            if (i != indexNotBilled) {
//                amount = amount + bill.get(i);
//            }
//            i++;
//        }

        amount = amount / 2;
        int amountOverCharged = amountCollected - amount;
        if (amountOverCharged == 0) {
            return "Bon Appetit";
        } else {
            return String.valueOf(amountOverCharged);
        }
    }

}
