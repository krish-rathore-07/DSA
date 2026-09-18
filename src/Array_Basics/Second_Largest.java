package Array_Basics;

public class Second_Largest {
    public static int SecondLargest(int arr[] ){
        int largest = arr[0];
        int secondLargest = -1;
        for(int i : arr){
            if(largest<i){
                secondLargest = largest;
                largest = i;
            }
            else if(secondLargest<i){
                secondLargest = i;
            }
        }
        return secondLargest;
    }
    void main(){
        int arr[] = {8,7,5,4,3,2,1,9,12};
        System.out.println("Second Largest Element is : "+SecondLargest(arr));
    }
}
