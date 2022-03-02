package ex1;

public class Utils {

    public static int findMaxInsideUnsortedArray(int[] v) throws Exception {
        if (v == null || v.length == 0) {
            throw new Exception("Vector is null");
        }
        int min = v[0];
        for (int i = 1; i < v.length - 1; i += 1) {
            if (min > v[i]) {
                min = v[i];
            }
        }

        return min;
    }

}
