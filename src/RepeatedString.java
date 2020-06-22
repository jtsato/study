public class RepeatedString {

    public static void main(String[] args) throws Exception {
        System.out.println(repeatedString("aba", 10));
    }

    static long repeatedString(String s, long n) {

        long repeats = n / s.length();
        int occurs = countOccurs(s);
        
        long rest = n % s.length(); 
        if (rest == 0){
            return repeats * occurs;
        }
        return (repeats * occurs) + countOccurs(s.substring(0, (int) rest));
    }

    static int countOccurs(String s){
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a') {
                count++;
            }
        }
        return count;
    }
}