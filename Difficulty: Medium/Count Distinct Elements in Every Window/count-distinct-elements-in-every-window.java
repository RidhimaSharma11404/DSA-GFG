class Solution {
    ArrayList<Integer> countDistinct(int arr[], int k) {
        ArrayList<Integer>ans=new ArrayList<>();
        HashMap<Integer,Integer>map=new HashMap<>();
        int i=0;
        int j=0;
        while(j<arr.length){
            map.put(arr[j],map.getOrDefault(arr[j],0)+1);
            if(j-i+1<k){
                j++;
            }else{
                ans.add(map.size());
                map.put(arr[i],map.get(arr[i])-1);
                if(map.get(arr[i])==0){
                    map.remove(arr[i]);
                }
                i++;
                j++;
            }
        }
        return ans;
    }
}
