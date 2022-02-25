import java.util.Scanner;

public class MaxMinInUnsortedArray {
    static int[] solution(int[] arr){
        int[] ans = new int[2];
        ans[0] = arr[0];
        ans[1] = arr[0];
        for(int k : arr){
            if(k > ans[0])
                ans[0] = k;
            if(k < arr[1])
                ans[1] = k;
        }
        return ans;
    }

    public static void main(String[] args) {
        int n;
        System.out.print("Enter the no of element in array: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i++)
            arr[i] = sc.nextInt();
        System.out.print("Max = " + solution(arr)[0] + " Min = " + solution(arr)[1]);
        sc.close();
    }
}
