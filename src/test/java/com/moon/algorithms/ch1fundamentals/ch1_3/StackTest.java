package com.moon.algorithms.ch1fundamentals.ch1_3;

import com.moon.algorithms.std.In;
import com.moon.algorithms.std.Interval1D;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Chanmoey
 * @date 2023/9/20
 */
public class StackTest {

    @Test
    public void linkedListStackTest() {
        In in = new In("tobe.txt");
        String line = in.readLine();
        String[] op = line.split(" ");
        Stack<String> stack = new Stack<>();
        for (String o : op) {
            if ("-".equals(o)) {
                stack.pop();
            } else {
                stack.push(o);
            }
            System.out.println(stack);
        }
    }

    @Test
    public void shuffleTest() {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 20; i++) {
            list.add(i);
        }

        Map<Integer, Integer> countMap = new HashMap<>();
        for (int i = 1; i <= 20; i++) {
            countMap.put(i, 0);
        }

        Map<Integer, List<Double>> probabilityMap = new HashMap<>();

        for (int j = 0; j < 10; j++) {
            for (int i = 0; i < 100; i++) {
                Collections.shuffle(list);
                int firstNumber = list.get(0);
                countMap.put(firstNumber, countMap.get(firstNumber) + 1);
            }

            for (int i = 1; i <= 20; i++) {
                double probability = (double) countMap.get(i) / 100;
                probabilityMap.computeIfAbsent(i, k -> new ArrayList<>()).add(probability);
            }
        }

        for (Integer k : probabilityMap.keySet()) {
            System.out.println("数字 " + k + "出现的概率为：" + probabilityMap.get(k) + " 概率均值：" + mean(probabilityMap.get(k)));
        }
    }

    private static double mean(List<Double> list) {
        double sum = 0;
        for (Double d : list) {
            sum += d;
        }

        return sum / list.size();
    }
}
