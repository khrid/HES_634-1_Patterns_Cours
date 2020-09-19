package ex2.behavior;

public class SelectionSortBehavior implements SortBehavior{
    @Override
    public void sort(int[] vector) {
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
}
