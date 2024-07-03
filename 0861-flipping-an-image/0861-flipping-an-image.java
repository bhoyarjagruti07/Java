class Solution {
    public int[][] flipAndInvertImage(int[][] arr) {
          for(int[] row : arr) {
            ///reverse the array
            for(int i=0;i<(arr[0].length + 1)/2;i++) {
            //swap
            int temp = row[i]^1;
            row[i] = row[arr[0].length -i -1]^1;
            row[arr[0].length -i -1] = temp;
            }
        }
        return arr;
    }
}