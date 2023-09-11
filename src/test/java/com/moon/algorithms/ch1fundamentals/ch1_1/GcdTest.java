package com.moon.algorithms.ch1fundamentals.ch1_1;

import com.moon.algorithms.ch1fundamentals.ch1_1.Gcd;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author Chanmoey
 * @date 2023/7/28
 */
public class GcdTest {

    @Test
    public void testGcd() {
        // 测试输入为两个正整数的情况
        int result1 = Gcd.gcd(12, 18);
        Assert.assertEquals(6, result1);

        // 测试输入为两个负整数的情况
        Assert.assertThrows(IllegalArgumentException.class, () -> Gcd.gcd(-12, -18));

        // 测试输入中包含0的情况
        int result3 = Gcd.gcd(0, 18);
        Assert.assertEquals(18, result3);

        // 测试输入中包含一个为0的情况
        int result4 = Gcd.gcd(12, 0);
        Assert.assertEquals(12, result4);

        // 测试输入为两个相等的正整数的情况
        int result5 = Gcd.gcd(30, 30);
        Assert.assertEquals(30, result5);
    }
}
