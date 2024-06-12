class Solution {
    public boolean isPalindrome(String s) {
        if (s.isEmpty()) {
            return true;
        }
        int i = 0;
        int j = s.length()-1;
        s = s.toLowerCase();
        while(j > i) {
            char a = s.charAt(i);
            char b = s.charAt(j);

            if(!(a>='a' && a<='z' || a>='0' && a<='9')) {
                i++;
                continue;
            }
            if(!(b>='a' && b<='z' || b>='0' && b<='9')) {
                j--;
                continue;
            }
            if(a!=b)
            return false;
            i++;
            j--;
        }
        return true;
    }
}