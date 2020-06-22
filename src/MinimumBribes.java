public class MinimumBribes {

    public static void main(final String[] args) throws Exception {

        int[] a1 = {2};
        int[] a2 = {5};
        int[] a3 = {2, 1, 5, 3, 4};
        int[] a4 = {5};
        int[] a5 = {2, 5, 1, 3, 4};

        minimumBribes(a1);
        minimumBribes(a2);
        minimumBribes(a3);
        minimumBribes(a4);
        minimumBribes(a5);
    }

    static void minimumBribes(int[] q) {

        if (q.length <= 1){
            return;
        }

        int swaps = 0;

        for (int i = 0; i < q.length; i++){
            if ((q[i] - (i+1) > 2)) {
                System.out.println("Too chaotic");
                return;
            }
            for (int j = i-1; j >= 0 && j >= q[i]-2; j--){
                if (q[j] > q[i]) {
                    swaps++;
                }
            }
        }
        
        System.out.println(swaps);
    }
}