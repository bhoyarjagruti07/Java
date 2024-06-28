class Solution {
    public static int findNumbers(int arr[]) {
        int count = 0 ;
        for(int a : arr) {
            if(even(a)) {
                count++;
            }
        }
        return count;
    }
    // function to check a number contain even digit or not
    public static boolean even(int a) {
        int nod = digits(a);
        if(nod % 2 == 0) {
            return true;
        }
        return false;
    }
    public static int digits(int a) {
        int count =0;
        while(a > 0) {
            count++;
            a = a / 10;
        }

        return count;
    }
}
