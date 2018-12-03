package spbu;

public class Library {
    private static int gcd(int x, int y) {
        if (x < 0 || y < 0)
            throw new IllegalArgumentException("Negative number");
        while (y != 0) {
            int z = x % y;
            x = y;
            y = z;
        }
        return x;
    }

    static String getSum(int LIMIT, int[] rads) {
        long sum = 0;
        for (int c = 2; c < LIMIT; c++) {
            if (rads[c] == c)
                continue;
            for (int a = 1, end = (c - 1) / 2; a <= end; a++) {
                int b = c - a;
                assert a < b;
                if ((long)rads[a] * rads[b] * rads[c] < c && gcd(a, b) == 1)
                    sum += c;
            }
        }
        return Long.toString(sum);
    }
}
