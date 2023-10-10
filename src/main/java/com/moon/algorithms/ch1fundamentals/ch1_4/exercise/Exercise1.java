package com.moon.algorithms.ch1fundamentals.ch1_4.exercise;

/**
 * @author Chanmoey
 * @date 2023/10/7
 */
public class Exercise1 {

    public static void main(String[] args) {
        /*
        To prove this statement using mathematical induction, we will first establish the base case and then assume the statement holds for some value of N. Finally, we will prove that the statement also holds for N+1.

        Base case:
        When N = 1, there is only one item and no triples can be chosen. The formula N(N-1)(N-2)/6 evaluates to 1(1-1)(1-2)/6 = 0/6 = 0, which is the correct number of triples that can be chosen.

        Assumption:
        Assume that for some positive integer k, the number of different triples that can be chosen from k items is given by the formula k(k-1)(k-2)/6.

        Inductive step:
        We want to prove that the number of different triples that can be chosen from (k+1) items is given by the formula (k+1)k(k-1)/6.

        Consider a set of (k+1) items. We can choose a triple in two ways:
        1. The triple does not include the (k+1)th item.
        2. The triple includes the (k+1)th item.

        Case 1: The triple does not include the (k+1)th item.
        In this case, we are choosing a triple from the first k items. By our assumption, the number of different triples that can be chosen from k items is given by the formula k(k-1)(k-2)/6.

        Case 2: The triple includes the (k+1)th item.
        In this case, we need to choose two more items from the first k items. The number of ways to choose two items from k items is given by the binomial coefficient C(k,2) = k(k-1)/2. Once we have chosen these two items, we can combine them with the (k+1)th item to form a triple.

        Therefore, the total number of different triples that can be chosen from (k+1) items is given by the sum of the number of triples from Case 1 and Case 2:
        k(k-1)(k-2)/6 + k(k-1)/2 = (k(k-1)(k-2) + 3k(k-1))/6 = k(k-1)(k+2)/6 = (k+1)k(k-1)/6.

        By the principle of mathematical induction, we have proven that the number of different triples that can be chosen from N items is precisely N(N-1)(N-2)/6 for all positive integers N.
         */
    }
}
