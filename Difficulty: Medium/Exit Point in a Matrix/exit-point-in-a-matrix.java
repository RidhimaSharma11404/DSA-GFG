
class Solution {
    public List<Integer> exitPoint(int[][] mat) {

        int n = mat.length;
        int m = mat[0].length;

        int dir = 0;
        int i = 0;
        int j = 0;

        while(i >= 0 && i < n && j >= 0 && j < m) {

            dir = (dir + mat[i][j]) % 4;
            mat[i][j] = 0;

            if(dir == 0) {
                j++;
            }
            else if(dir == 1) {
                i++;
            }
            else if(dir == 2) {
                j--;
            }
            else {
                i--;
            }
        }

        if(j >= m) j = m - 1;
        else if(i >= n) i = n - 1;
        else if(j < 0) j = 0;
        else if(i < 0) i = 0;

        return Arrays.asList(i, j);
    }
}
