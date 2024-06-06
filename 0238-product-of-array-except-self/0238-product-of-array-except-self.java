class Solution {
    public int[] productExceptSelf(int[] a) {
        int prefix[] = new int[a.length];
        int suffix[] = new int[a.length];

        prefix[0] = 1;
        for(int i=1;i<a.length;i++) {
            prefix[i] = prefix[i-1]*a[i-1]; 
        }

        suffix[suffix.length-1] = 1;
        for(int i = a.length - 2; i>= 0; i--) {
            suffix[i] = suffix[i+1] * a[i+1];
        } 
        int ans[] = new int[a.length];
        for(int i=0;i< ans.length;i++) {
            ans[i] = prefix[i] * suffix[i];
        }
        return ans;
    }
}