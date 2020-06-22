public class MinimumSwaps {

    public static void main(String[] args) throws Exception {

        int[] ar = {4, 3, 2, 1};

        System.out.println(minimumSwaps(ar));
    }

    static int minimumSwaps(int[] arr) {

        int swaps = 0;

        for (int index = 0; index < arr.length; index++){
            int rightValue = index + 1;
            if (arr[index] != rightValue) {
                int temp = arr[index];
                int found = find(rightValue, arr);
                arr[index] = arr[found];
                arr[found] = temp;
                swaps++;
            }
        }

        return swaps;
    }

    static int find(int value, int[] arr){
        for (int i = value; i < arr.length; i++){
            if (arr[i] == value){
                return i;
            }
        }
        return -1;
    }
    
}