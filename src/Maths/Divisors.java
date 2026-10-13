package Maths;

import java.util.ArrayList;
import java.util.Collections;

public class Divisors {

    // in this function we will find the all divisors of the given number
    public static ArrayList<Integer> findDivisor(int num){
        ArrayList<Integer> list = new ArrayList<>();
        int limit = (int) Math.sqrt(num);
//        for(int i = 1;i<=limit;i++){
        for(int i = 1;i*i<=num;i++){
            if (num % i == 0) {
                list.add(i);
                if(num/i!=i)list.add(num/i);
            }
        }
        Collections.sort(list);
        return list;
    }
    void main(){
        int num = 36;
        IO.println("The Divisor of "+num+" is : "+findDivisor(num));
    }
}
