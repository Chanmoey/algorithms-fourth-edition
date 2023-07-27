package com.moon.algorithms.ch1fundamentals;

/**
 * 计算两个非负整数p和q的最大公约数，如果q为0，则最大公约数为p。
 * 否则，将p除以q得到余数r，p和q的最大公约数即为q和r的最大公约数
 * @author Chanmoey
 * @date 2023/7/28
 */
public class Gcd {

    private Gcd(){}

    public static int gcd(int p, int q) {
        if ((p & 0x8000) == 0x8000 || (q & 0x8000) == 0x8000) {
            throw new IllegalArgumentException("p and q must be positive integer!");
        }

        if (q == 0) {
            return p;
        }
        int r = p % q;
        return gcd(q, r);
    }
}
