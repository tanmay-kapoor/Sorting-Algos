import java.util.*;

class CountingSort {

    int[] sort(int[] arr) {
        int n = arr.length;
        int max = arr[0];
        for(int i = 1; i<n; i++) {
            if(arr[i]>max) {
                max = arr[i];
            }
        }
        int[] count = new int[max+1];
        int[] sorted = new int[n];

        for(int i = 0; i<n; i++) {
            count[arr[i]]++;
        }
        for(int i = 1; i<count.length; i++) {
            count[i] += count[i-1];
        }
        for(int i = 0; i<n; i++) {
            int index = count[arr[i]]-1;
            sorted[index] = arr[i];
            count[arr[i]]--;
        }
        return sorted;
    }

    public static void main(String[] args) {
        CountingSort ob = new CountingSort();
        Scanner sc = new Scanner(System.in);
        System.out.print("Unsorted : ");
        String[] s = sc.nextLine().split(" ");
        int[] arr = new int[s.length];
        for(int i = 0; i<arr.length; i++) {
            arr[i] = Integer.parseInt(s[i]);
        }
        System.out.println("Sorted : " + Arrays.toString(ob.sort(arr)));
    }
}