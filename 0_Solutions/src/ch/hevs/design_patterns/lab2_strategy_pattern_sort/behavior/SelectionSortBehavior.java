package ch.hevs.design_patterns.lab2_strategy_pattern_sort.behavior;

/**
 * Design patterns Lab 2 - Strategy
 */
public class SelectionSortBehavior implements SortBehavior {
    
    public void sort(int[] vector) {
        int temp, cursor = 0;
        
        for (int i=0; i<vector.length; i++) {
            temp   = vector[i];
            cursor = i;
            
            for (int j=i; j<vector.length; j++) {
                if (vector[j] < temp) {
                    temp   = vector[j];
                    cursor = j;
                }
            }
            
            vector[cursor] = vector[i];
            vector[i]      = temp;
        }
    }
    
}
