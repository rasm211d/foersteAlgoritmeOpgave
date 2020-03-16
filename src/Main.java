public class Main {
    static int[] data1 = {5, 7, 1, 20, 50, 10, 15, 9, 41, 8, 61};
    static int[] data2 = {5, 7, 1, 20, 50, 10, 15, 9, 41, 8, 61};
    static int[] data3 = {5, 7, 10, 5, 2, 5, 15, 5, 41, 2, 61};
    static int[] data4 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    public static void main(String[] args) {
        //opg A
        find(10);

        //opg B
        findAlle(5);

        //opg C
        findMax();
        System.out.println();

        //Brug af bubblesort
        bubbleSort(data1);
        for (int i = 0; i < data1.length; i++) {
            System.out.println(data1[i]);
        }
        System.out.println();

        //Brug af selectionsort
        selectionSort(data2);
        for (int i = 0; i < data2.length ; i++) {
            System.out.println(data2[i]);
        }
    }


    //Metode til opg a
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

    //Metode til opg b
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


    //Metode til opg c
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

    //Selection opgaver
    public static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 1; j < array.length - i; j++) {
                if (array[j - 1] > array[j]) {
                    swapBubbleSort(array, j, j - 1);
                }
            }
        }
    }

    private static void swapBubbleSort(int[] array, int a, int b) {
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }

    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int currentMinIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] > array[currentMinIndex]) {
                    currentMinIndex = j;
                }
            }
            if (currentMinIndex != i) {
                swapSelectionSort(array, i ,currentMinIndex);
            }

        }

    }
    public static void swapSelectionSort(int[] array, int a, int b) {
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }


}
