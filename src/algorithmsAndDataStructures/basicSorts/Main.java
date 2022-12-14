package algorithmsAndDataStructures.basicSorts;


import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] myArr = {5, 2, 6, 1, 3, 4};
        BubbleSort.bubbleSort(myArr);
        System.out.println(Arrays.toString(myArr));


        int[] myArr2 = {7, 10, 9, 12, 8, 11};
        SelectionSort.selectionSort(myArr2);
        System.out.println(Arrays.toString(myArr2));


        int[] myArr3 = {18, 13, 17, 16, 14, 15};
        InsertionSort.insertionSort(myArr3);
        System.out.println(Arrays.toString(myArr3));

    }
}
