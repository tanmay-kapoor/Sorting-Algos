import java.util.*;

class MergeSort {

    void merge(int[] arr, int low, int mid, int high) {
        int n1 = mid-low+1;
        int n2 = high-mid;
        int[] left = new int[n1];
        int[] right = new int[n2];

        for(int i = 0; i<n1; i++) {
            left[i] = arr[low+i];
        }
        for(int j = 0; j<n2; j++) {
            right[j] = arr[mid+1+j];
        }

        int i = 0, j = 0, k = low;
        while(i<n1 && j<n2) {
            if(left[i]<=right[j]) {
                arr[k++] = left[i++];
            }
            else {
                arr[k++] = right[j++];
            }
        }
        while(i<n1) {
            arr[k++] = left[i++];
        }
        while(j<n2) {
            arr[k++] = right[j++];
        }
    }

    void sort(int[] arr, int low, int high) {
        if(low<high) {
            int mid = (low+high)/2;
            sort(arr, low, mid);
            sort(arr, mid+1, high);
            merge(arr, low, mid, high);
        }
    }

    public static void main(String[] args) {
        MergeSort ob = new MergeSort();
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