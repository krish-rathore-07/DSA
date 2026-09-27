package Array.Medium;


//Given an integer array of size n, find all elements that appear more than ⌊n / 3⌋ times.

import java.util.ArrayList;
import java.util.List;

public class Majority_Element_2 {


    public static List<Integer> majorityElement(int arr[]){
        List<Integer> list = new ArrayList<>();

        int element1 = Integer.MIN_VALUE;
        int element2 = Integer.MIN_VALUE;

        int count1 = 0;
        int count2 = 0;

        for(int i =0;i<arr.length;i++){
            if(element1 == arr[i]){
                count1++;
            }
            else if(element2 == arr[i]){
                count2++;
            }
            else if(count1==0){
                element1=arr[i];
                count1=1;
            }
            else if(count2==0){
                element2=arr[i];
                count2 =1;
            }
            else {
                count2--;
                count1--;
            }
        }
        count1 =0;
        count2=0;
        for(int i : arr){
            if(element1==i) count1++;
            else if(element2==i) count2++;
        }
        if(count1> arr.length/3) list.add(element1);
        if(count2 > arr.length/3) list.add(element2);

        return list;
    }

    void main(){
        int arr[] = {1,2};
        System.out.println("The Majority Elements are : " +majorityElement(arr));
    }

}
