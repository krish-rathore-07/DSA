package Array.Basics;

//You are given an array arr[] having unique elements. Your task is to return the type of array described below.
//
//Return 1 if the array is in ascending order.
//Return 2 if the array is in descending order
//Return 3 if the array is in descending rotated order
//Return 4 if the array is in ascending rotated order
//You may assume that the input array is always one of the four types.
public class TypeOfArray {

    public static int typeOfArray(int arr[]){
        int min = 0;
        int max = 0;
        int n= arr.length;
        for(int i = 0;i<arr.length;i++){
            if(arr[max]<arr[i]){
                max=i;
            }
            if(arr[min]>arr[i]){
                min=i;
            }
        }
        if(min==0 && max==n-1)return 1;
        if(min==n-1 && max==0) return 2;
        if(min<max)return 4;
        if(max<min)return 3;
        return 0;
    }


    void main(){
        int arr[] = {};
        int ans = typeOfArray(arr);

        String res = switch(ans){
            case 1 -> "Array in Ascending order";
            case 2 -> "Array in Descending order";
            case 3 -> "Array in Descending Rotated order";
            default -> "Array in Ascending Rotated order";
        };
        System.out.println(res);
    }
}
