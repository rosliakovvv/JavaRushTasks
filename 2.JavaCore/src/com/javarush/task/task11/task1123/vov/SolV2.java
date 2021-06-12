package com.javarush.task.task11.task1123.vov;

public class SolV2 {
    public static void main(String[] args) {
        int[] data = new int[]{1, 2, 3, 5, -2, -8, 0, 77, 5, 5};

        PairV2<Integer, Integer> res = getMinimumAndMaximum(data);

        System.out.println("The minimum is " + res.x);
        System.out.println("The maximum is " + res.y);
    }

    public static PairV2<Integer, Integer> getMinimumAndMaximum(int[] inputArray) {
        if (inputArray == null || inputArray.length == 0) {
            return new PairV2<Integer, Integer>(null, null);
        }

        // напишите тут ваш код
        int min = 0;
        int max = 0;

        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] > max)
                max = inputArray[i];

            if (inputArray[i] < min)
                min = inputArray[i];
        }

        return new PairV2<>(min, max);


    }

    public static class PairV2<X, Y> {
        public X x;
        public Y y;

        public PairV2(X x, Y y) {
            this.x = x;
            this.y = y;
        }
    }
}
