/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortowanie;

/**
 *
 * @author acer1
 */
public class Sorter {

    public static int[] SorowaniePrzezWymiane(int[] input) {
        int tmp = 0;
        int firstIdx = 0;
        int secondIdx = 0;
        int minIdx = 0;

        for (int x = 0; x < (input.length - 1); x++) {
            secondIdx = findMinIdx(input, x);
            if (input[x] > input[secondIdx]) {
                tmp = input[x];
                input[x] = input[secondIdx];
                input[secondIdx] = tmp;
                System.out.println("x ->" + x + " wartosc " + input[x]);
                System.out.println("secondIdx ->" + secondIdx + " wartosc " + input[secondIdx]);
            }

        }
        return input;
    }

    private static int findMinIdx(int[] input, int startIdx) {
        int min = startIdx;
        for (int i = startIdx; i < input.length-1; i++) {
            if (input[i] < input[i+1]) {
                min = i;
            }
        }
        System.out.println("min: " +min);
        return min;
    }
}
