import java.util.*;

class SelectionSort {

    void sort(int[] arr) {
        int n = arr.length;
        for(int i = 0; i<n; i++) {
            int min = i;
            for(int j = i+1; j<n; j++) {
                if(arr[j]<arr[min]) {
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }

    public static void main(String[] args) {
        SelectionSort ob = new SelectionSort();
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