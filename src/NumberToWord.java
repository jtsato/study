public class NumberToWord {

    private static final String[] units = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
    private static final String[] doubles = {"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
    private static final String[] tens = {"", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};

    private static final String[] hundreds1 = {"", "thousand", "million", "billion"};
    private static final String[] hundreds2 = {"", "thousands", "millions", "billions"};

    private static String wordToNumber(int number) {
        String word = "";
        int reduced = number % 100;
        int pos = reduced % 10;

        if (reduced < 10) {
            word += units[pos];
        } else if (reduced < 20) {
            word += doubles[pos];
        } else {
            if (pos == 0) {
                word += tens[pos];
            } else {
                word += tens[pos] + "-" + units[pos];
            }
        }
        int hundred = number / 100;
        return hundred > 0 ? units[hundred] + " hundred " + word : word;
    }

    // O(n) — Linear Time
    private static String wordToNumberHundreds(int number) {
        String word = "";
        int index = 0;
        do {
            int num = number % 1000;
            if (num != 0) {
                String singularPlural = num == 1 ? hundreds1[index] : hundreds2[index];
                word = wordToNumber(num) + " " + singularPlural + " " + word;
            }
            index++;
            number = number / 1000;
        } while (number > 0);
        return word.substring(0, 1).toUpperCase() + word.substring(1);
    }

    public static void main(String[] args) {

        System.out.println("       11: " + wordToNumberHundreds(11));
        System.out.println("      222: " + wordToNumberHundreds(222));
        System.out.println("     3333: " + wordToNumberHundreds(3333));
        System.out.println("    44444: " + wordToNumberHundreds(44444));
        System.out.println("   555555: " + wordToNumberHundreds(555555));
        System.out.println("  1666666: " + wordToNumberHundreds(1666666));
        System.out.println("  6666666: " + wordToNumberHundreds(6666666));
        System.out.println(" 77777777: " + wordToNumberHundreds(77777777));
        System.out.println("888888888: " + wordToNumberHundreds(888888888));
    }
}
