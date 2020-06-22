import java.io.IOException;
import java.util.HashMap;

public class SockMerchant {

    public static void main(String[] args)
        throws IOException {

        int[] ar = {10, 20, 20, 10, 10, 30, 50, 10, 20};
        
        System.out.println(sockMerchant(ar.length, ar));
    }

    static int sockMerchant(int n, int[] ar) {

        final HashMap<Integer, Integer> map = new HashMap<>(0);

        for (int index = 0; index < n; index++) {
            final Integer element = Integer.valueOf(ar[index]);
            final Integer result = map.get(element);
            if (result == null) {
                map.put(element, 1);
            } else {
                map.put(element, result + 1);
            }
        }
        
        int sum = 0;
        for (int element : map.values()) {
            sum += element / 2;
        }
        
        return sum;
    }
}
