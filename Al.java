import java.util.*;
class Al {
    static ArrayList<Integer> subarraySum(int[] arr, int target) {
        int start = 0, sum = 0;
        ArrayList<Integer> result = new ArrayList<>();

        for (int end = 0; end < arr.length; end++) {
            sum += arr[end];
            while (sum > target && start <= end) {
                sum -= arr[start];
                start++;
            }
            if (sum == target) {
                result.add(start + 1);
                result.add(end + 1);
                return result; 
            }
        }
        result.add(-1);
        return result;
    }

    public static void main(String args[]) {
        int[] arr = {1, 2, 3, 7, 5};
        int target = 12;
        System.out.println(subarraySum(arr, target));

        int[] arr2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target2 = 15;
        System.out.println(subarraySum(arr2, target2)); 

        int[] arr3 = {5, 3, 4};
        int target3 = 2;
        System.out.println(subarraySum(arr3, target3));
    }
}
