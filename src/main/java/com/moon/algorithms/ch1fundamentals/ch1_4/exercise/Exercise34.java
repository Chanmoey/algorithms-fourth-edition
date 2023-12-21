package com.moon.algorithms.ch1fundamentals.ch1_4.exercise;

/**
 * @author Chanmoey
 * @date 2023/10/7
 */
public class Exercise34 {

    public static void main(String[] args) {
        System.out.println(hotOrCold(1, 1000, 99));
    }

    private static int hotOrCold(int lo, int hi, int target) {
        int mid = lo + (hi - lo) / 2;
        System.out.printf("lo: %d, hi: %d, I guess: %d%n", lo, hi, mid);
        if (mid == target) {
            System.out.println("WIN!");
            return mid;
        }

        int left = mid - 1;
        int right = mid + 1;
        int ld = Math.abs(target - left);
        int rd = Math.abs(target - right);

        if (ld < rd) {
            return hotOrCold(lo, mid, target);
        } else {
            return hotOrCold(mid, hi, target);
        }
    }

    private static int hotOrCold(int lo, int hi, int target, int lastGuess) {
        int guess = lo + hi - lastGuess;
        if (guess > lastGuess) {
            // TODO pass
        }
        return 0;
    }

}
