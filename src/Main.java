import java.lang.reflect.Array;

public class Main {
    static int[] data1 = {5, 7, 1, 20, 50, 10, 15, 9, 41, 8, 61};
    static int[] data2 = {5, 7, 1, 5, 2, 5, 15, 5, 41, 2, 61};
    static int[] data3 = {5, 7, 10, 5, 2, 5, 15, 5, 41, 2, 61};
    static int[] data4 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    public static void main(String[] args) {
        find(10);
        findAlle(5);
        findMax();
    }

    public static boolean find(int x) {
        boolean found = false;
        for (int i = 0; i < data1.length ; i++) {
            if (x == data1[i]) {
                found = true;
            }
        }
        System.out.println(found);
        return found;
    }

    public static int findAlle(int x) {
        int antal = 0;
        for (int i = 0; i < data2.length ; i++) {
            if (x == data2[i]) {
                antal++;
            }
        }
        System.out.println("antal gange tallet '" + x + "' optræder: " + antal);
        return antal;
    }

    public static void findMax() {
        int max = data3[0];
        for (int i = 0; i < data3.length; i++) {
            if (data3[i] > max) {
                max = data3[i];
            }
        }
        System.out.println(max);
    }

    /*public static void binarySearch(int first, int last, int key) {
        int mid = ((data4.length - 1)) / 2;
        while (first <= last) {
            if (data4[mid] < key) {
                first = mid + 1;
            } else if (data4[mid] == key) {
                System.out.println("Element is found at index " + mid);
                break;
            } else {
                last = mid - 1;
            }
            if (first > last) {
                System.out.println("Element is not found");
            }
        }

    }*/


}
