class Solution {
    public String addSpaces(String s, int[] spaces) {
        StringBuilder sb = new StringBuilder();
        sb.append(s);
        for(int i=0;i<spaces.length;i++) {
            spaces[i]=spaces[i]+i;
        }
        for (int a : spaces) {
            sb.insert(a," ");
        }
        return sb.toString();
    }
}