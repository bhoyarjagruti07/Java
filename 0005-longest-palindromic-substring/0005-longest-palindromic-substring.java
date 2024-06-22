class Solution {
    int max = 0, start = 0, end = 0;
    public boolean isPalin(String s, int i, int j) {  
        while(j>i) {
           char chi = s.charAt(i);
           char chj = s.charAt(j);
           
           if(chi!=chj) 
            return false;
            i++;
            j--;   
    }
      return true;
}
    public String longestPalindrome(String s) {
        int n = s.length();
        for(int i=0;i<n;i++) {
            for(int j=i;j<n;j++) {
                if(isPalin(s,i,j)==true) {
                    if((j-i+1)> max) {
                        max = j-i+1;
                        start = i;
                        end = j;
                    }
                }
            }
        }
        return s.substring(start,end+1);
    }
}