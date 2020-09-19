package ex2;

import ex2.behavior.BubbleSortBehavior;
import ex2.behavior.InsertSortBehavior;
import ex2.behavior.SelectionSortBehavior;
import ex2.sort.Sorter;

/**
 * Design patterns Lab 2 - Strategy
 */
public class StrategySortLauncher {

    public static void main(String[] args) {
        StrategySortLauncher launcher = new StrategySortLauncher();
        launcher.test();
    }

    public void test() {
        int[] tab1 = { 99, 11, 2, 33, 12, 1, 0, 99, 34, 35 } ;
        int[] tab2 = { 99, 11, 2, 33, 12, 1, 0, 99, 34, 35 } ;
        int[] tab3 = { 99, 11, 2, 33, 12, 1, 0, 99, 34, 35 } ;

        Sorter sorter = new Sorter();

        System.out.println("test bubble sort");
        //sorter.sort(tab1, "BubbleSort");
        sorter.setSortBehavior(new BubbleSortBehavior());
        sorter.sort(tab1);
        sorter.showVectorData(tab1);

        System.out.println("test insert sort");
        //sorter.sort(tab2, "InsertSort");
        sorter.setSortBehavior(new InsertSortBehavior());
        sorter.sort(tab2);
        sorter.showVectorData(tab2);

        System.out.println("test selection sort");
        //sorter.sort(tab3, "SelectionSort");
        sorter.setSortBehavior(new SelectionSortBehavior());
        sorter.sort(tab3);
        sorter.showVectorData(tab3);
    }
}
