package TugasPersonal;

import java.util.Arrays;

public class ArrayOperations {

    // Metode tranversal (menampilkan data pada array)
    public static void traversal(int[] arr) {
        System.out.println("Isi array: " + Arrays.toString(arr));
    }

    // Metode Linear Search (Metode pencarian data target dengan menggunakan linear search)
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    // Binary Search (Metode pencarian data target dengan menggunakan binary search, mengharuskan data di sorted terlebih dahulu)
    public static int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (arr[mid] == target) return mid;
            else if (arr[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return -1;
    }

    // Insert (Memasukan data ke dalam array)
    public static int[] insert(int[] arr, int value, int pos) {
        int[] newArr = new int[arr.length + 1];

        for (int i = 0; i < newArr.length; i++) {
            if (i < pos) newArr[i] = arr[i];
            else if (i == pos) newArr[i] = value;
            else newArr[i] = arr[i - 1];
        }

        return newArr;
    }

    // Delete (Menghapus data yang sudah tersimpan dalam array)
    public static int[] delete(int[] arr, int target) {
        int[] newArr = new int[arr.length - 1];

        for (int i = 0, k = 0; i < arr.length; i++) {
            if (arr[i] != target) {
                newArr[k++] = arr[i];
            }
        }

        return newArr;
    }
}
