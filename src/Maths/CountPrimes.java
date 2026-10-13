package Maths;

public class CountPrimes {

    public static int countPrimes(int num){
        if(num<=2)return 0;
        boolean flag [] = new boolean[num];
        int limit = (int)Math.sqrt(num);
        for(int i= 2 ;i<=limit;i++){
            if(flag[i]==false){

                for(int j= i*i;j<num;j+=i){
                    flag[j]=true;
                }
            }
        }
        int count=0;
        for(int i=2;i<num;i++){
            if(flag[i]==false)count++;
        }
        return count;
    }

    void main(){
        IO.println("krish");
        int n= 50;
        IO.println("The number of Prime till the nth no. is : " + countPrimes(n));
    }
}
