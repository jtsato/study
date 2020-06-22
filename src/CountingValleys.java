public class CountingValleys {

    public static void main(String[] args) throws Exception {

        int n = 8;
        String s = "UDDDUDUU";

        System.out.println(countingValleys(n, s));
    }

    static int countingValleys(int n, String s) {

        int level = 0;
        int valleys = 0;

        for (int index = 0; index < n; index++){
            char c = s.charAt(index);
            if (c == 'U'){ level++; }
            if (c == 'D'){ level--; }
            if (level == 0 && c == 'U'){
                valleys += 1;
            }
        }
         
        return valleys;
    }
}