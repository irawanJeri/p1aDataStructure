package TugasPersonal;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListOperations {

    // Tambah data dalam arraylist
    public static void tambah(ArrayList<Integer> list, int position,int value) {
        list.add(position, value);
    }

    // Hapus data dalam arraylist
    public static void hapus(ArrayList<Integer> list, int value) {
        list.remove(Integer.valueOf(value));
    }

    // Search data dalam arraylist
    public static int cari(ArrayList<Integer> list, int target) {
        return list.indexOf(target);
    }

    // Men sorting data dalam araylist
    public static void urutkan(ArrayList<Integer> list) {
        Collections.sort(list);
    }

    // Menampilkan data yang ada
    public static void tampilkan(ArrayList<Integer> list) {
        System.out.println("Isi ArrayList: " + list);
    }
}
