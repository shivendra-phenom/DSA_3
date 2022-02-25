import java.util.Scanner;

/*
Find the square root of the integer without using any library. You have to find the floor value of the square root.

For example if the given number is 16, then the answer would be 4.

If the given number is 27, the answer would be 5 because sqrt(5) = 5.196 whose floor value is 5.

The expected time complexity is O(log(n))
 */
class SquareRoot
{
    static int sqrt(int n)
    {
        int low = 0, high = n/2;
        int result = 0;
        while(low <= high)
        {
            int mid = (low+high)/2;
            if(mid*mid == n)
                return mid;
            if(mid*mid < n)
            {
                result = mid;
                low = mid+1;
            }
            else
                high = mid-1;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        n = sqrt(n);
        System.out.print(n);
        sc.close();
    }
}