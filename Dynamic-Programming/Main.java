public class Main {

    public static void main(String[] args) {
        int steps = TripleStep(4); // Expected : 7
        steps = TripleStep(12); // Expected : 927
        System.out.printf("There is %d ways to climb %d stairs in steps of 1, 2 and 3\n", steps, 12);
    }

    private static int TripleStep(int n) {
        if (n == 1 || n == 2) return n;
        if (n == 3) return 4;

        int[] steps = new int[n];
        steps[0] = 1;
        steps[1] = 2;
        steps[2] = 4;

        for (int i = 3; i < n; i++)
            steps[i] = steps[i - 3] + steps[i - 2] + steps[i - 1];

        return steps[n - 1];
    }

}
