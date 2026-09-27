package Array.Basics;


//Given an array nums of size n, return the majority element.
//
//The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.



public class Majority_Element {

    public static int majorityElement(int arr[]){
        int element = arr[0];
        int count= 0;
        for(int i= 0;i<arr.length;i++){
            if(element == arr[i]){
                count++;
            }
            else if(count ==0){
                element = arr[i];
                count=1;
            }
            else {
                count--;
            }
        }
        return element;
    }

    void main(){
        int arr[] = {3,2,3};
        System.out.println("the majority element is : "+ majorityElement(arr));
    }
}
