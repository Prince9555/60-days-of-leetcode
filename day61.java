public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int a = 1;
        int counter = 0;

        for(int i = 0; i < 32; i++) {
            if((n & a) != 0) {
                counter++;
            }
            a <<= 1;
        }
        return counter;
    }
}

    