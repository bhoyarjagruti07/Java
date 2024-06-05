class Solution {
    public List<List<Integer>> threeSum(int[] a) {
        Set <List<Integer>> ans = new HashSet<>();
        if(a.length==0)
        return new ArrayList<>(ans);
        Arrays.sort(a);
        for(int i = 0;i < a.length-2;i++) {
           int  j = i + 1;
           int  k = a.length - 1; 
           while (k>j) {
           int sum = a[j] + a[k];
           if(sum == -a[i]) {
            ans.add(Arrays.asList(a[i],a[j],a[k]));
            j++;
            k--;
           }
            else if (sum > -a[i]) {
                k--;
            }
            else if (sum < -a[i]) {
                j++;
            }
           }
        }
        return new ArrayList<>(ans);
    }
}