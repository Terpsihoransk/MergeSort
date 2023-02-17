import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] a1 = new int[]{21, 23, 24, 40, 75, 76, 78, 77, 900, 2100, 2200, 2300, 2400, 2500};
        int[] a2 = new int[]{10, 11, 41, 50, 65, 86, 98, 101, 190, 1100, 1200, 3000, 5000};
        int[] a3 = new int[a1.length + a2.length];
        mergeSort(a1, a2, a3);
        System.out.println(Arrays.toString(a3));
    }


    public static void mergeSort(int[] a1, int[] a2, int[] a3) {
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < a1.length && j < a2.length) {
            if (a1[i] <= a2[j]) {
                a3[k] = a1[i];
                i++;
            } else {
                a3[k] = a2[j];
                j++;
            }
            k++;
        }
        while (i < a1.length) {
            a3[k] = a1[i];
            i++;
            k++;
        }
        while (j < a2.length) {
            a3[k] = a2[j];
            j++;
            k++;
        }
    }
}



