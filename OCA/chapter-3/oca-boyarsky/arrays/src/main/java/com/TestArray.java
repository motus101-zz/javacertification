package com;

public class TestArray {
    public static void main(String... args) {
        int[][][] ints = new int[3][2][3];
        String[][] strings = new String[5][];
        int[][] a = new int[][]{{2, 3}, {4, 5}};
        int[][] b = new int[][]{{2, 3}, {4, 5}};
        ArrayList<Integer> al1 = new ArrayList<>(Arrays.asList(4, 5, 6, 9));
        ArrayList<Integer> al2 = new ArrayList<>(Arrays.asList(4, 5, 6, 9));
        Period p = Period.ofDays(1).ofYears(1);
        if (al1.equals(al2)) {
            System.out.println("a equals b");
        }else {
            System.out.println("a doesn't equals b");
        }

        System.out.println(Arrays.deepToString(strings));
        fillArray(ints);
    }

    public static void fillArray(int[][][] array) {
        Random random = new Random();
        for (int[][] arr1 : array) {
            for (int[] arr2 : arr1) {
                for (int i = 0; i < arr2.length; i++) {
                    arr2[i] = random.nextInt(10);
                }
            }
        }
        System.out.println(Arrays.deepToString(array));
    }
}