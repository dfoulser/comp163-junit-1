import java.util.ArrayList;

public class SlowInsertionSort {
  // TODO: Write the slowInsertionSort() method on ArrayList<String>
  public static void slowInsertionSort(ArrayList<String> list) {
    // Skip the first element.
    for (int i = 1; i < list.size(); i++) {
      int index = findInsertionIndex(list, i);
      moveTo(list, i, index);
    }
  }
  
  public static void moveTo(ArrayList<String> list, int from, int to) {
    if (from == to) {
      return;
    } else {
      String str = list.remove(from);
      list.add(to, str);
    }
  }
  
  // Find where to insert, or insert at last otherwise.
  // Return the index where to insert.
  public static int findInsertionIndex(ArrayList<String> list, int from, int last) {
    for (int i = 0; i < last; i++) {
      // If the list[from] is < list[i], then insert at i
    }
  }


  public static void main(String[] args) {
    // Create an ArrayList<String> and sort it.
    String[] words1 = {"the", "quick", "brown", "fox", "jumps"};
    ArrayList<String> arrayList1 = new ArrayList<String>();
    for (int i = 0; i < words1.length; i++) {
      arrayList1.add(words1[i]);
    }
    // Print the unsorted list, sort it, and print the sorted list.
    System.out.println(arrayList1.toString());
    SlowInsertionSort.slowInsertionSort(arrayList1);
    System.out.println(arrayList1.toString());

    // Create an ArrayList<String> and sort it.
    String[] words2 = {"over", "the", "lazy", "dog"};
    ArrayList<String> arrayList2 = new ArrayList<String>();
    for (int i = 0; i < words2.length; i++) {
      arrayList2.add(words2[i]);
    }
    // Print the unsorted list, sort it, and print the sorted list.
    System.out.println(arrayList2.toString());
    SlowInsertionSort.slowInsertionSort(arrayList2);
    System.out.println(arrayList2.toString());
  }
}