package com.moon.algorithms.ch1fundamentals.ch1_4.exercise;

import com.moon.algorithms.ch1fundamentals.ch1_1.BinarySearch;
import com.moon.algorithms.ch1fundamentals.ch1_4.StaticSETofInts;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Chanmoey
 * @date 2023/10/7
 */
public class Exercise21 {

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 10, 9, 8, 7, 6};
        DistinctStaticSetOfInts set = new DistinctStaticSetOfInts(arr);
        System.out.println(set.contains(0));
        System.out.println(set.contains(10));
    }

    private static class DistinctStaticSetOfInts{

        private final int[] arr;

        public DistinctStaticSetOfInts(int[] keys) {
            Set<Integer> set = new HashSet<>();
            for (int k : keys) {
                set.add(k);
            }

            this.arr = new int[set.size()];
            int idx = 0;
            for (int i : set) {
                arr[idx++] = i;
            }

            Arrays.sort(arr);
        }

        public boolean contains(int key) {
            return BinarySearch.rank(key, this.arr) != -1;
        }
    }
}
