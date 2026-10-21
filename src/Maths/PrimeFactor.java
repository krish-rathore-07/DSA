package Maths;


import java.util.ArrayList;

import static Maths.IsPrime.isPrime;

// in this question we have to find the prime factors of the given number
public class PrimeFactor {

    public static boolean isPrime(int num){
        if(num<=1)return false;
        for(int i= 2;i<num;i++){
            if(num%i==0)return false;
        }
        return true;
    }

    public static ArrayList<Integer> primeFactor(int num){
        int limit = (int)Math.sqrt(num);
        ArrayList<Integer> list = new ArrayList<>();
        for(int i= 1;i<=num;i++){
            if(num%i==0 && isPrime(i)){
                list.add(i);
            }
        }
        return list;
    }

    // this is the most optimized solution for this problem
    public static ArrayList<Integer> primeFactorOptimal(int num){
        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 2;i*i<=num;i++){
            if(num%i==0){
                list.add(i);
                while(num%i==0){
                    num=num/i;
                }
            }
        }
        if(num>1)list.add(num);
        return list;
    }

    void main(){
        int num = 780;
        IO.println("The Prime Factors of the given number is : "+primeFactorOptimal(num));
    }
}
