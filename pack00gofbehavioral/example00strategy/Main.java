package pack00gofbehavioral.example00strategy;

// Client
public class Main {
  public static void main(String[] args) {
    // Create context with BubbleSort Strategy
    
    SortingContext sortingContext = new SortingContext(new BubbleSortStrategy());
    int[] array1 = {5, 2, 9, 1, 5};
    sortingContext.performSort(array1); 
 
    // Change strategy to MergeSort Strategy
    sortingContext.setSortingStrategy(new MergeSortStrategy());
    int[] array2 = {8, 3, 7, 4, 2};
    sortingContext.performSort(array2); 
 
    // Change strategy to QuickSort Strategy
    sortingContext.setSortingStrategy(new QuickSortStrategy());
    int[] array3 = {6, 1, 3, 9, 5};
    sortingContext.performSort(array3); 
  }
}

/* 
Output

Sorting using Bubble Sort
Sorting using Merge Sort
Sorting using Quick Sort
*/