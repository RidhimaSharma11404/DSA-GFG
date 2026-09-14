class Solution {
    public static int[] productExceptSelf(int arr[]) {
        // code here
        int n=arr.length;
        int []prefix=new int[n];
        int []suffix=new int[n];
        prefix[0]=1;
        suffix[n-1]=1;
        for(int i=1;i<arr.length;i++){
            prefix[i]=prefix[i-1]*arr[i-1];
        }
        for(int i=n-2;i>=0;i--){
            suffix[i]=suffix[i+1]*arr[i+1];
        }
        int []p=new int[n];
        for(int i=0;i<n;i++){
            p[i]=prefix[i]*suffix[i];
        }
        return p;
    }
}
