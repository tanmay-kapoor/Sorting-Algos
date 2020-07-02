import java.util.*;

class InsertionSort {

    void sort(int[] arr) {
        int n = arr.length;
        for(int i = 1; i<n; i++) {
            int j = i-1;
            int key = arr[i];
            while(j>=0 && arr[j]>key) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }

    public static void main(String[] args) {
        InsertionSort ob = new InsertionSort();
        Scanner sc = new Scanner(System.in);
        System.out.print("Unsorted : ");
        String[] s = sc.nextLine().split(" ");
        int[] arr = new int[s.length];
        for(int i = 0; i<arr.length; i++) {
            arr[i] = Integer.parseInt(s[i]);
        }
        ob.sort(arr);
        System.out.println("Sorted : " + Arrays.toString(arr));
    }
}