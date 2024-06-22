class Solution {
    public int compress(char[] ch) {
       StringBuilder sb = new StringBuilder("");

       int i = 1;
       int count = 1;
       sb.append(ch[0]);

       while(i < ch.length) {
        if(ch[i] == ch[i - 1]) {
            count++;
        } else {
            if(count > 1) {
                sb.append(count);
            }
                sb.append(ch[i]);
                count = 1;
            }
            i++;
        }
       
       if(count > 1) {
       sb.append(count);
       }
       for(int j=0;j<sb.length();j++) {
        ch[j] = sb.charAt(j);
       }
       return sb.length();
    }
}
