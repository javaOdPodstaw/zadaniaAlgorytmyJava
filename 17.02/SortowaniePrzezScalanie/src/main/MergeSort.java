package main;

public class MergeSort {

    private int[] tablica;
    private int[] tmpTab;

    public MergeSort(int[] tab) {
        this.tablica = tab.clone();
        this.tmpTab = new int[tab.length];
    }

    public void doSort() throws Exception {
        if (this.tablica.length == 0) {
            throw new Exception("Pusta tablica!");
        }

        if (this.tablica.length == 1) {
            return;
        }

        sort(0, this.tablica.length - 1);
    }

    private void sort(int poczatek, int koniec) {
        int polowa;
        if (koniec > poczatek) {
            polowa = (koniec + poczatek) / 2;
            sort(poczatek, polowa);
            sort(polowa + 1, koniec);
            merge(poczatek, polowa, koniec);
        }
    }

    private void merge(int poczatek, int polowa, int koniec) {
        for (int i = poczatek; i <= koniec; i++) {
            this.tmpTab[i] = this.tablica[i];
        }

        int i = poczatek;
        int j = polowa + 1;
        int k = poczatek;

        while (i <= polowa && j <= koniec) {
            if (this.tmpTab[i] < this.tmpTab[j]) {
                this.tablica[k] = this.tmpTab[i];
                k++;
                i++;
            } else {
                this.tablica[k] = this.tmpTab[j];
                j++;
                k++;
            }
        }

        while (i <= polowa) {
            this.tablica[k] = this.tmpTab[i];
            k++;
            i++;
        }
    }

    public void printTab() {
        for (int i = 0; i < this.tablica.length; i++) {
            System.out.print(this.tablica[i] + " ");
        }
    }

}
