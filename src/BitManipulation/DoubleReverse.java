package BitManipulation;
//Reversing an integer means to reverse all its digits.
//
//For example, reversing 2021 gives 1202. Reversing 12300 gives 321 as the leading zeros are not retained.
//Given an integer num, reverse num to get reversed1, then reverse reversed1 to get reversed2. Return true if reversed2 equals num. Otherwise return false.
//

public class DoubleReverse {

    public static int reverseNum(int n){
        int temp = n;
        int ans = 0;
        while(temp>0){
            int lastDigit = temp%10;
            ans = (ans * 10) + lastDigit;
            temp = temp/10;
        }
        return ans;
    }
    void main(){
        int n = 23400;
        int reverse1 = reverseNum(n);
        int reverse2 = reverseNum(reverse1);
        if(reverse2==n){
            System.out.println("double reverse cant cause any change");
        }
        else {
            System.out.println("double reverse can cause change");
        }
    }
}
