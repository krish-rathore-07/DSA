package Maths;

public class PowerFunction {

    // but this solution not works on the leetcode because of one test case (307) but still it is the optimal solution....
    public static double power(double x ,int n){
        long pow = n;
        if(pow<0){
            pow = -pow;
            x = 1.0/x;
        }
        double ans = 1.0;
        while(pow>0){
            if(pow%2==1){
                ans = ans * x;
                pow--;
            }
            else{
                x = x*x;
                pow = pow/2;
            }
        }
        return ans;
    }

    // this solution is also optimal solution but not the solution who works on the leetcode...
    public static double powerBitManipulation(double x , int n){
        long power = n;
        double ans = 1.0;
        if(power<0){
            power = -power;
            x = 1/x;
        }
        while(power>0){
            if((power&1)==1){
                ans = ans*x;
            }
            x = x * x;
            power>>=1;
        }
        return ans;
    }

    void main(){
        double x = 2;
        int n = 21;

        IO.println("The Power of ("+x+","+n+") is : "+powerBitManipulation(x,n));
    }
}
