import java.util.Scanner;

/*
You are given a sorted array which is rotated at some random pivot point.

Example: [0,1,2,4,5,6,7] might become [4,5,6,7,0,1,2]

You are given a target value to search. If found in the array return its index, otherwise return -1.

You can assume there are no duplicates in the array and your algorithm's runtime complexity must be in the order of O(log n).

Example:

Input: nums = [4,5,6,7,0,1,2], target = 0, Output: 4

 */
class SearchinArray {

    static int search(int arr[], int l, int h, int key) {
        if (l > h)
            return -1;

        int mid = (l + h) / 2;
        if (arr[mid] == key)
            return mid;
        if (arr[l] <= arr[mid]) {
            if (key >= arr[l] && key <= arr[mid])
                return search(arr, l, mid - 1, key);
            return search(arr, mid + 1, h, key);
        }
        if (key >= arr[mid] && key <= arr[h])
            return search(arr, mid + 1, h, key);

        return search(arr, l, mid - 1, key);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no of element in array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array: " );
        for (int i = 0; i < n ; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the number to be searched: ");
        int key = sc.nextInt();
        System.out.println(search(arr,0,n-1,key));
    }
}