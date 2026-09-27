package BitManipulation;


// in this solution we are adding two numbers without using the '+' operator
public class SumOfInteger {

    public static int sumTwoNumber(int a ,int b){

        while(b!=0){
            int temp = (a&b)<<1;
            a = a^b;
            b= temp;
        }
        return a;
    }

//    we can also write the solution as
//    while(b!=0){
//    int sum = a^b;
//    int carry = (a&b)<<1;
//    a = sum;
//    b=carry;
//    }
//    return a;

    void main(){
        int a = 3;
        int b = 42;
        System.out.println(sumTwoNumber(a,b));
    }

}
