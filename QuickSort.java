import java.util.*;

class QuickSort {
    Random rand = new Random();

    int partition(int[] arr, int low, int high) {
        int pivot = arr[low];
        int j = low, temp;
        for(int i = low+1; i<=high; i++) {
            if(arr[i]<=pivot) {
                j++;
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;
        return j;
    }

    void sort(int[] arr, int low, int high) {
        if(low<high) {
            int index = rand.nextInt(high-low+1) + low;
            int temp = arr[low];
            arr[low] = arr[index];
            arr[index] = temp;

            int m = partition(arr, low, high);
            sort(arr, low, m-1);
            sort(arr, m+1, high);
        }
    }

    public static void main(String[] args) {
        QuickSort ob = new QuickSort();
        Scanner sc = new Scanner(System.in);
        System.out.print("Unsorted : ");
        String[] s = sc.nextLine().split(" ");
        int[] arr = new int[s.length];
        for(int i = 0; i<arr.length; i++) {
            arr[i] = Integer.parseInt(s[i]);
        }
        ob.sort(arr, 0, arr.length-1);
        System.out.println("Sorted : " + Arrays.toString(arr));
    }
}