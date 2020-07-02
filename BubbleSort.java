import java.util.*;

class BubbleSort {

    void sort(int[] arr) {
        int n = arr.length;
        for(int i = 0; i<n-1; i++) {
            for(int j = 0; j<n-i-1; j++) {
                if(arr[j]>arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        BubbleSort ob = new BubbleSort();
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