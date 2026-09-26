package BitManipulation;

public class ReverseBits {

    public static int reverseBits(int n ){
        int temp = n;
        int ans = 0;
        for(int i= 0;i<32;i++){
            int bit = n&1;
            ans <<= 1;
            ans = ans | bit;
            n>>=1;
        }
        return ans;
    }

    public static void main(String args[]){
        int n = 43261596;
        // ans is 964176192
        System.out.println(reverseBits(n));
    }
}
