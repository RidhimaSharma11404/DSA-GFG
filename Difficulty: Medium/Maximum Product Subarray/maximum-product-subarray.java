class Solution {
    int maxProduct(int[] arr) {

        int max = arr[0];
        int min = arr[0];
        int ans = arr[0];

        for(int i = 1; i < arr.length; i++) {

            int x = arr[i];

            if(x < 0) {
                int temp = max;
                max = min;
                min = temp;
            }

            max = Math.max(x, max * x);
            min = Math.min(x, min * x);

            ans = Math.max(ans, max);
        }

        return ans;
    }
}