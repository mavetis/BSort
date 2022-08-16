package BubbleSort;
public class BubbleSortTest {
    public static void main(String[] args ){
        BubbleSort lS = new BubbleSort();
        int arr[] = {1,3,2,5,4,6,8,7};

        System.out.println("Array on which we apply Bubble Sort: ");
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i]);
    }
    System.out.println();
    lS.sortLinear(arr); //Applying Bubble sort to sort the Array  
    for (int i = 0; i < arr.length; i++) {
        System.out.println("Array after applying Bubble Sort: ");

      System.out.print("Array Sorted: " + arr[i]);
    }
    }

    
}
