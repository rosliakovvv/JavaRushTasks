package com.javarush.task.task11.task1123.vov;

public class SolV {
    public static void main(String[] args) {

        int[] data = new int[]{1, 2, 3, 5, -2, -8, 0, 77, 5, 5};
        
// или
//        int[] data = new int[]{};

        PairV<Integer, Integer> result = getMinimumAndMaximum(data);

        System.out.println("The minimum is " + result.x);
        System.out.println("The maximum is " + result.y);
    }

    public static PairV<Integer, Integer> getMinimumAndMaximum(int[] inputArray) {
        if (inputArray == null || inputArray.length == 0) {
            return new PairV<Integer, Integer>(null, null);
        }

        // напишите тут ваш код
        for (int i = 0; i < inputArray.length - 1; i++) {
            for (int j = i; j < inputArray.length; j++) {
                if (inputArray[i] < inputArray[j]) {
                    int tmp = inputArray[i];
                    inputArray[i] = inputArray[j];
                    inputArray[j] = tmp;
                }
            }
        }

        return new PairV<Integer, Integer>(inputArray[0], inputArray[inputArray.length - 1]);
    }

    public static class PairV<X, Y> {
        public X x;
        public Y y;

        public PairV(X x, Y y) {
            this.x = x;
            this.y = y;
        }
    }
}
