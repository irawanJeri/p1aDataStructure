package TugasPersonal;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;

public class Comparison {
    public static void main(String[] args) {

            // ================= DATA AWAL =================
            int[] array = {10, 20, 30, 40, 50};
            ArrayList<Integer> list = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));

            // ================= TRAVERSAL =================
            System.out.println("Array Traversal: " + Arrays.toString(array));
            System.out.println();
            System.out.println("ArrayList Traversal: " + list);
            System.out.println("\n");

            // ================= SEARCH =================
            int target = 30;

            // Array
            long startArray = System.nanoTime();
            int indexArray = ArrayOperations.linearSearch(array, target);
            long endArray = System.nanoTime();

            // ArrayList
            long startList = System.nanoTime();
            int indexList = list.indexOf(target);
            long endList = System.nanoTime();

            System.out.println("Pencarian " + target + " dalam Array: Ditemukan di indeks " + indexArray);
            System.out.println("Pencarian " + target + " dalam ArrayList: Ditemukan di indeks " + indexList);
            System.out.println("\n");

            // ================= INSERT =================
            int value = 25;
            int pos = 2;

            array = ArrayOperations.insert(array, value, pos);
            list.add(pos, value);

            System.out.println("Array setelah penyisipan elemen 25: " + Arrays.toString(array));
            System.out.println("ArrayList setelah penyisipan elemen 25: " + list);
            System.out.println("\n");

            // ================= WAKTU EKSEKUSI =================
            double timeArray = (endArray - startArray) / 1_000_000.0;
            double timeList = (endList - startList) / 1_000_000.0;

            System.out.println("Waktu eksekusi pencarian pada Array: " + timeArray + " ms");
            System.out.println("Waktu eksekusi pencarian pada ArrayList: " + timeList + " ms");
        }
    }
