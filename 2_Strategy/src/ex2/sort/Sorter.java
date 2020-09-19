package ex2.sort;


import ex2.behavior.BubbleSortBehavior;
import ex2.behavior.SortBehavior;

/**
 * Design patterns Lab 2 - Strategy
 */
public class Sorter implements SortBehavior{

    SortBehavior sortBehavior = new BubbleSortBehavior(); // arbitrary selection of default behavior

    public void sort(int[] vector/*, String sortmethod*/) {
        /*switch (sortmethod) {
            case "BubbleSort":
                bubbleSort(vector);
                break;
            case "InsertSort":
                insertSort(vector);
                break;
            case "SelectionSort":
                selectionSort(vector);
                break;
        }*/
        sortBehavior.sort(vector);
    }

    public void setSortBehavior(SortBehavior sortBehavior) {
        this.sortBehavior = sortBehavior;
    }

    public void bubbleSort(int[] vector) {
        int temp;
        int nbrePermutation = -1;
        int nbreIteration = 0;

        while (nbrePermutation != 0) {
            nbrePermutation = 0;

            for (int i = 0; i < vector.length - nbreIteration - 1; i++) {

                if (vector[i] > vector[i + 1]) {
                    nbrePermutation++;
                    temp = vector[i + 1];
                    vector[i + 1] = vector[i];
                    vector[i] = temp;
                }
            }
        }
    }

    public void insertSort(int[] vector) {
        int temp;

        for (int i = 1; i < vector.length; i++) {

            temp = vector[i];

            for (int j = i - 1; j >= 0; j--) {
                if (vector[j] > temp) {
                    vector[j + 1] = vector[j];
                    vector[j] = temp;
                } else {
                    vector[j + 1] = temp;
                    break;
                }
            }
        }
    }

    public void selectionSort(int[] vector) {
        int temp, cursor = 0;

        for (int i = 0; i < vector.length; i++) {
            temp = vector[i];
            cursor = i;

            for (int j = i; j < vector.length; j++) {
                if (vector[j] < temp) {
                    temp = vector[j];
                    cursor = j;
                }
            }

            vector[cursor] = vector[i];
            vector[i] = temp;
        }
    }


    public void showVectorData(int[] vector) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < vector.length; i++) {
            sb.append(vector[i] + "\t");
        }

        System.out.println(sb.toString());
    }
}