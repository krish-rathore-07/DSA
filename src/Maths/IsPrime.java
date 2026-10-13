package Maths;

public class IsPrime {

    public static boolean isPrime(int n){
        if(n<=1)return false;
        if(n==2)return true;
        if(n%2==0)return false;


        int limit = (int)Math.sqrt(n);
//        for(int i= 2;i<=limit;i++){
          for(int i = 2;i*i<=n;i++){ // this is also an approach to run a loop until the square root of the number
            if(n%i==0)return false;
        }
        return true;
    }

    void main(){
        int i = 7;
        IO.println("The no. "+i+" is prime : " + isPrime(i));
    }
}
