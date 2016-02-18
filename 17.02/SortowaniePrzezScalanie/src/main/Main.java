package main;

public class Main {

    public static void main(String[] args) {
        int[] tablica = {22, 4, 6, 32, 25, 25, -2, 4, 32};
        int[] tablica1 = {22};
        int[] tablica2 = {};

        MergeSort mSort = new MergeSort(tablica);
        mSort.printTab();
        System.out.println("");
        try {
            mSort.doSort();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        mSort.printTab();
        
    }

}
