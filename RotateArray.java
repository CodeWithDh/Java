import org.w3c.dom.ls.LSOutput;

import java.util.*;

import static java.util.Collections.swap;



public class RotateArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 1;
        int[] ans = new int[arr.length];
        int n = arr.length;
        int j = 0;


        k = k % n;


        for (int i = n - k; i < n; i++) {
            ans[j++] = arr[i];
        }


        for (int i = 0; i < n - k; i++) {
            ans[j++] = arr[i];
        }


        for (int i = 0; i < n; i++) {
            System.out.print(ans[i] + " ");
        }

    }
}

