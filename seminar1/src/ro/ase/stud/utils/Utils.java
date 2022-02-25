package ro.ase.stud.utils;

public class Utils {

    public static void sortArray(int[] vector) {
        int min = Integer.MAX_VALUE;
        int occurrences = 0;
        var x = 0;
        if (vector.length > 0) {
            for (int j : vector) {
                if (j < min) {
                    min = j;
                    occurrences = 1;
                } else {
                    if (j == min) {
                        occurrences++;
                    }
                }
            }

            if (occurrences == 0) {
                System.out.println("Array is empty");
            } else {
                System.out.printf("The min val is %d and the number of occurrences is %d.%n", min, occurrences);
            }
        }
    }
}
