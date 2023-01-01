public class Main {
    public static void main(String[] args) {
        int n = 0b100000000000000;
        int m = 0b10011;
        int i = 2;
        int j = 6;
        int result = Solution.insertion(n, m, i, j);

        System.out.println(Integer.toBinaryString(result));
    }
}

class Solution {
    public static int insertion(int n, int m, int i, int j) {
        int mask = ~(~(0b11111111111111111111111111111111 << (j - i)) << i);
        return (n & mask) | (m << i);
    }
}