public class Combinatorics {
    
    // [The order DOES NOT matters]
    // How many combinations can we have with 4 flavors of ice cream if I can choose unique 2 of them ?
    // (chocolate + vanilla = vanilla + chocolate)
    static int combination(final int n, final int k) { // Combinação
        return factorial(n) / (factorial(k) * factorial(n - k));
    }

    // How many combinations can we have with 4 flavors of ice cream if I can choose 2 of them ?
    // (chocolate + vanilla = vanilla + chocolate)
    // But we can repeat the flavor (ex: chocolate + chocolate, vanilla + vanilla, etc)
    static int combinationWithRepetition(final int n, final int k) {
        return factorial(n + k - 1) / (factorial(k) * factorial(n - 1));
    }

    // [The order matters]
    // How many ways can I choose my 2 favorite flavors of ice cream presented 4 flavors
    static int permutation(final int n, final int k) { // Arranjo
        return factorial(n) / factorial(n - k);
    }

    // In how many different orders we can put 4 scoops of ice cream if we have 2 flavors to choose
    // But I can repeat the flavor (ex: chocolate + chocolate, vanilla + vanilla, etc)
    static int permutationWithRepetition(final int n, final int k) {
        return (int) Math.pow(n, k);
    }

    // In how many different orders, you can put 4 different flavors of ice cream in an ice cream cone
    static int simplePermutation(final int n) { // Permutação
        return factorial(n);
    }

    static int factorial(final int n) {
        int result = n;
        for (int index = n - 1; index > 1; index--) {
            result *= index;
        }
        return result;
    }

    public static void main(final String[] args) throws Exception {
        System.out.println(String.valueOf(combination(4, 2))); // 6
        System.out.println(String.valueOf(combinationWithRepetition(4, 2))); // 10
        System.out.println(String.valueOf(permutation(4, 2))); // 12
        System.out.println(String.valueOf(permutationWithRepetition(4, 2))); // 16
        System.out.println(String.valueOf(simplePermutation(4))); // 24
    }
}
