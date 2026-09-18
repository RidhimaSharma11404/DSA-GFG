class Solution {
    public int findMaxAverage(List<Integer> arr, int k) {
        // code here        ArrayList<Integer>ans=new ArrayList<>();
        int i=0;
        int j=0;
        int sum=0;
        int max=Integer.MIN_VALUE;
        int index=0;
        while(j<arr.size()){
           
            sum+=arr.get(j);
            if(j-i+1<k){
                j++;
            }else{
                if(sum>max){
                    max=sum;
                    index=i;
                }
                sum-=arr.get(i);
                i++;
                j++;
            }
        }
        return index;
    }
}