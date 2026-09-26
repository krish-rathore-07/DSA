package BitManipulation;



public class NumberOf1Bits {

    public static int countSetBits(int n){
        int temp = n;
        int count = 0;
        while(temp>0){
            if((temp&1)==1)count++;
            temp>>=1;
        }
        return count;
    }

    void main(){
        int n=11;
        // ans for 11 is 3
        System.out.println("Number of Set Bits in "+ n+ " is : "+countSetBits(n));
    }
}
