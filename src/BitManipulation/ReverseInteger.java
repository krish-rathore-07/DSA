package BitManipulation;

public class ReverseInteger {


        public static int reverse(int x) {

            long reverse = 0;

            while (x != 0) {
                int num = x % 10;
                reverse = reverse * 10 + num;
                x = x / 10;
            }

            if (reverse < Integer.MIN_VALUE || reverse > Integer.MAX_VALUE) {
                return 0;
            }
            return (int) reverse;
        }

        void main(){
            int  n = -123;
            System.out.println(reverse(n));
        }
    }

