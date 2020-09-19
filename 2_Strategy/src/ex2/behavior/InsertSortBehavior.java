package ex2.behavior;

public class InsertSortBehavior implements SortBehavior{
    @Override
    public void sort(int[] vector) {
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
}
