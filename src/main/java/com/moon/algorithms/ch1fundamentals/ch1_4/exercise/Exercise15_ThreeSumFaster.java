package com.moon.algorithms.ch1fundamentals.ch1_4.exercise;

import com.moon.algorithms.std.StdOut;

/**
 * @author Chanmoey
 * @date 2023/10/7
 */
public class Exercise15_ThreeSumFaster {

    public static void main(String[] args) {

        // Two Sum Faster Test
        int[] array = {-10, -10, -5, 0, 5, 10, 10, 15, 20};
        int[] arrayTest1 = {-3, -2, 2, 3, 5, 99};
        int[] arrayTest2 = {-10, -10, -10, 10};
        int[] arrayTest3 = {0, 0, 0, 0, 0, 0, 0};
        int[] arrayTest4 = {-2, -1, 0, 0, 0, 0, 0, 0, 3};
        int[] arrayTest5 = {-2, 0, 1, 1, 1, 1, 2};

        StdOut.println("Method 1");
        StdOut.println("ThreeSumFaster: " + threeSumFaster(array) + " Expected: 8");
        StdOut.println("ThreeSumFaster: " + threeSumFaster(arrayTest1) + " Expected: 1");
        StdOut.println("ThreeSumFaster: " + threeSumFaster(arrayTest2) + " Expected: 0");
        StdOut.println("ThreeSumFaster: " + threeSumFaster(arrayTest3) + " Expected: 35");
        StdOut.println("ThreeSumFaster: " + threeSumFaster(arrayTest4) + " Expected: 21");
        StdOut.println("ThreeSumFaster: " + threeSumFaster(arrayTest5) + " Expected: 7");
    }

    public static int threeSumFaster(int[] a) {
        int l = 0;
        int r = a.length - 1;
        if (a[r] < 0 || a[l] > 0) {
            return 0;
        }
        int count = countZeroMatches(a);

        for (int i = 0; i < a.length; i++) {
            l = i + 1;
            r = a.length - 1;
            int target = -a[i];
            while (l < r) {
                if (a[l] + a[r] > target) {
                    r--;
                } else if (a[l] + a[r] < target) {
                    l++;
                } else {
                    // a[l] == a[r] == 0
                    if (a[l] == 0 && a[r] == 0) {
                        l++;
                        r--;
                        continue;
                    }

                    if (a[l] == a[r]) {
                        int equalCount = r - l + 1;
                        count += equalCount * (equalCount - 1) / 2;
                        break;
                    }
                    int lc = 1;
                    int lr = a[l];
                    while (l + 1 < r && a[l + 1] == lr) {
                        lc ++;
                        l++;
                    }

                    int rc = 1;
                    int rr = a[r];
                    while (r - 1 > l && a[r - 1] == rr) {
                        rc ++;
                        r--;
                    }

                    count += lc * rc;
                    l++;
                    r--;
                }
            }
        }

        return count;
    }

    private static int countZeroMatches(int[] a) {
        int count = 0;
        for (int n : a) {
            if (n == 0) {
                count ++;
            }
        }

        return (count * (count - 1) * (count - 2)) / 6;
    }
}
