package BitManipulation;

import java.util.ArrayList;
import java.util.List;

public class CountingBIts {

    public static int countBits(int n){
        int temp = n;
        int count = 0;
        while(temp>0){
            if((temp&1)==1)count++;
            temp>>=1;
        }
        return count;
    }
    public static List<Integer> countingBits(int n){
        List<Integer> list = new ArrayList<>();
        for(int i= 0;i<=n;i++){
            list.add(countBits(i));
        }
        return list;
    }

    void main(){
        int n = 9;
        System.out.println(countingBits(n));
    }
}
