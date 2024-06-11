class Solution {
    public int maxProfit(int[] p) {
        int max = 0;
        int minSofar = p[0];
        for ( int i=0;i<p.length;i++) { 
            minSofar = Math.min(minSofar,p[i]);
            int profit = p[i] - minSofar;
            max = Math.max(max,profit);
            }
        return max;
    }
}