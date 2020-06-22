public class JumpingOnClouds {

    public static void main(String[] args) throws Exception {

        int[] c = {0, 1, 1, 1, 0};

        System.out.println(jumpingOnClouds(c));
    }

    static int jumpingOnClouds(int[] c) {

        int n = c.length;
        int jumps = -1;

        for (int index = 0; index < n; index++, jumps++) {
            if (index<n-2 && c[index+2]==0) index++;
        }

        return jumps;
    }

}