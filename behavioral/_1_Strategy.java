package behavioral;

// Interface: Sort Strategy
interface SortingStrategy {
  void sort(int[] array);
}
 
// Concrete strategy: Bubble Sort Strategy
class BubbleSortStrategy implements SortingStrategy {
  @Override
  public void sort(int[] array) {
    // Implement Bubble Sort algorithm
    System.out.println("Sorting using Bubble Sort");
    // Actual Bubble Sort Logic here
  }
}
 
// Concrete strategy: Merge Sort Strategy
class MergeSortStrategy implements SortingStrategy {
  @Override
  public void sort(int[] array) {
    // Implement Merge Sort algorithm
    System.out.println("Sorting using Merge Sort");
    // Actual Merge Sort Logic here
  }
}
 
// Concrete strategy: Quick Sort Strategy
class QuickSortStrategy implements SortingStrategy {
  @Override
  public void sort(int[] array) {
    // Implement Quick Sort algorithm
    System.out.println("Sorting using Quick Sort");
    // Actual Quick Sort Logic here
  }
}

// SortingContext
class SortingContext {
  private SortingStrategy sortingStrategy;
 
  public SortingContext(SortingStrategy sortingStrategy) {
    this.sortingStrategy = sortingStrategy;
  }
 
  public void setSortingStrategy(SortingStrategy sortingStrategy) {
    this.sortingStrategy = sortingStrategy;
  }
 
  public void performSort(int[] array) {
    sortingStrategy.sort(array);
  }
}
 
// Client
public class _1_Strategy {
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