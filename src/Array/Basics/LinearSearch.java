package Array.Basics;

public class LinearSearch {

    public static int linearSeach(int arr[],int target){
        for(int i= 0;i<arr.length;i++){
            if(arr[i]==target)return i;
        }
        return -1;
    }

    void main(){
        int arr[]  = {1,2,3,4,5,6,7,8,9};
        int index = linearSeach(arr,7);
        System.out.println(index);
    }
}
