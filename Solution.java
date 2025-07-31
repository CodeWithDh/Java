import java.util.Arrays;

class Solution {
    public int[] decrypt(int[] code, int k) {
        int n = code.length;
        int[] ans = new int[n];

        if (k == 0) return ans;

        for (int i = 0; i < n; i++) {
            int sum = 0;
            if (k > 0) { // Sum the next k elements
                for (int j = 1; j <= k; j++) {
                    sum += code[(i + j) % n];
                }
            } else { // Sum the previous k elements
                for (int j = 1; j <= -k; j++) {
                    sum += code[(i - j + n) % n];
                }
            }
            ans[i] = sum;
        }

        return ans;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] code = {5, 7, 1, 4};
        int k = 3;
        System.out.println(Arrays.toString(solution.decrypt(code, k))); // Output: [12, 10, 16, 13]

        code = new int[]{2, 4, 9, 3};
        k = -2;
        System.out.println(Arrays.toString(solution.decrypt(code, k))); // Output: [12, 5, 6, 13]
    }
}
