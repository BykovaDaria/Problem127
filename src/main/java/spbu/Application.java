package spbu;

import java.util.Arrays;

public class Application {
    public static void main(String[] args) {
        System.out.println(new Application().run());
    }

    private String run() {
        int limit = 120000;
        int[] rads = new int[limit];
        Arrays.fill(rads, 1, rads.length, 1);
        for (int i = 2; i < rads.length; i++) {
            if (rads[i] == 1) {
                for (int j = i; j < rads.length; j += i)
                    rads[j] *= i;
            }
        }

        return Library.getSum(limit, rads);
    }

}
