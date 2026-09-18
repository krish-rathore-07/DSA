package Array_Basics;

public class Check_Sorted_Array {
    public static boolean IsArraySorted(int arr[] ){
        for(int i  = 0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
               return false;
            }
        }
        return true;
    }
    void main(){
        int arr[] = {1,2,3,4,5,6,77,8};
        boolean isSorted = IsArraySorted(arr);
        if(isSorted) System.out.println("Array is Sorted");
        else  System.out.println("Array is Not Sorted");
    }
}
