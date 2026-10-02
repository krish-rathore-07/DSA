package Array.Basics;

public class Third_Largest {
    public static int thirdLargest(int[] arr) {

        long first = Long.MIN_VALUE;
        long second = Long.MIN_VALUE;
        long third = Long.MIN_VALUE;

        for (int num : arr) {

            if (num == first || num == second || num == third) {
                continue;
            }

            if (num > first) {
                third = second;
                second = first;
                first = num;
            }
            else if (num > second) {
                third = second;
                second = num;
            }
            else if (num > third) {
                third = num;
            }
        }

        return third == Long.MIN_VALUE ? -1 : (int) third;
    }

    void main(){
        int arr[] = {1,3,6,2,4};
        System.out.println("Third Largest Element is : " +thirdLargest(arr));
    }
}
