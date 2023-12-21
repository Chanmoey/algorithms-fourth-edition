package com.moon.algorithms.ch1fundamentals.ch1_4.exercise;

import com.moon.algorithms.std.StdOut;

/**
 * @author Chanmoey
 * @date 2023/10/7
 */
public class Exercise24 {

    public static void main(String[] args) {
        // do not understand what question mean
        int[] floors = {0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1};
        int floor = findFloorInLgN(floors);
        StdOut.println("Floor: "  + floor + " Expected: 6");

        int[] lotOfFloors = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1};
        int floor2 = findFloorIn2LgF(lotOfFloors);
        StdOut.println("Floor: "  + floor2 + " Expected: 18");
    }

    public static int findFloorInLgN(int[] floors) {
        return findFloorInLgN(floors, 0, floors.length - 1);
    }

    public static int findFloorInLgN(int[] floors, int lo, int hi) {
        int key = 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (floors[mid] < key) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }

        return lo;
    }

    public static int findFloorIn2LgF(int[] floors) {
        int key = 1;
        int lo = 0;
        int hi = 1;
        while (hi < floors.length && floors[hi] < key) {
            lo = hi;
            hi = hi << 1;
        }

        hi = Math.min(hi, floors.length);
        return findFloorInLgN(floors, lo, hi);
    }
}
