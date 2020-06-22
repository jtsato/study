

public class NumberToWord {

    private static final String[] units = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

    private static final String[] doubles = {"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};

    private static final String[] tens = {"", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};

    private static final String[] hundreds1 = {"", "thousand", "million", "billion"};
    private static final String[] hundreds2 = {"", "thousands", "millions", "billions"};

    public static void main(String[] args) {

        System.out.println("       11: " + wordToNumber(11));
        System.out.println("      222: " + wordToNumber(222));
        System.out.println("     3333: " + wordToNumber(3333));
        System.out.println("    44444: " + wordToNumber(44444));
        System.out.println("   555555: " + wordToNumber(555555));
        System.out.println("  1666666: " + wordToNumber(1666666));
        System.out.println("  6666666: " + wordToNumber(6666666));
        System.out.println(" 77777777: " + wordToNumber(77777777));
        System.out.println("888888888: " + wordToNumber(888888888));
    }
    
    // O(n) — Linear Time
    
    private static String wordToNumber(int number) {

        String word = "";

        int index = 0;

        do {

            int num = number % 1000;
            if (num != 0) {
                String singularPlural = num == 1 ? hundreds1[index] : hundreds2[index];
                word = convertUnderOneThousand(num) + " " + singularPlural + " " + word;
            }
            index++;
            number = number / 1000;

        } while (number > 0);

        return word.substring(0, 1).toUpperCase() + word.substring(1);
    }

    private static String convertUnderOneThousand(int number) {

        String word = "";

        int index = number % 100;

        if (index < 10) {
            word += units[index % 10];

        } else if (index < 20) {
            word += doubles[index % 10];

        } else {
            if (index % 10 == 0) {
                word += tens[index / 10];
            } else {
                word += tens[index / 10] + "-" + units[index % 10];
            }
        }

        int hundred = number / 100;

        return hundred > 0 ? units[hundred] + " hundred " + word : word;
    }
}
