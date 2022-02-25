import java.util.*;
/*
Rearrange Array Elements so as to form two number such that their sum is maximum. Return these two numbers. You can assume that all array elements are in the range [0, 9]. The number of digits in both the numbers cannot differ by more than 1. You're not allowed to use any sorting function that Python provides and the expected time complexity is O(nlog(n)).

for e.g. [1, 2, 3, 4, 5]

The expected answer would be [531, 42]. Another expected answer can be [542, 31]. In scenarios such as these when there are more than one possible answers, return any one.
 */
public class RearrangeArrayElements {
    static List<List<Integer>> solution(List<Integer> arr){

        List<Integer> first = new ArrayList<Integer>(), second = new ArrayList<Integer>();

        int flag = 0;
        while (arr.size() != 0)
        {
            //System.out.println("I am here");
            Integer maxx = Collections.max(arr);
            if(flag == 0) {
                first.add(maxx);
                flag = 1;
            }
            else{
                second.add(maxx);
                flag = 0;
            }
            arr.remove(maxx);
        }
        List<List<Integer>> fin = new ArrayList<List<Integer>>();
        fin.add(first); fin.add(second);
        return fin;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter no of element in array: ");
        n = sc.nextInt();
        List<Integer> arr = new ArrayList<Integer>();
        for(int i = 0 ; i < n ; i++)
        {
            int a = sc.nextInt();
            arr.add(a);
        }
        System.out.println("Two Largest Integers Formed Are: ");
        for (List<Integer> l1 : solution(arr)) {
            for (Integer k : l1) {
                System.out.print(k);
            }
            System.out.println();
        }
    }
}
