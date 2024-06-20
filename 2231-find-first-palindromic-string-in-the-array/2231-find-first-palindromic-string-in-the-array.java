class Solution { 
    private boolean isPalin(String s) {

        int i = 0;
        int j = s.length() - 1;
            while(j>i) {
                char a = s.charAt(i);
                char b = s.charAt(j);

                if(a!=b) {
                   return false;
                }
                else {
                   i++;
                   j--;
                }
            }
            return true;
    }
    public String firstPalindrome(String[] words) {
        for (String word : words) {
          if (isPalin(word)) {
          return word;
        }
    }
    return "";
}
}