package Array.Basics;

import java.util.ArrayList;
import java.util.TreeSet;

public class Removing_Duplicates {
    public static ArrayList<Integer> removeDuplicate(int arr[] ){
        TreeSet<Integer> set = new TreeSet<>();
        for(int i : arr){
            set.add(i);
        }
        return new ArrayList<>(set);
    }
    //  int arr[] = {1,2,2,3,4,5,5,6,6,6,7};
    public static void removeDuplicate_Optimal(int arr[]){
        int k = 0;
        for(int i = 1; i<arr.length;i++){
            if(arr[i]!=arr[k]){
                k++;
                arr[k]=arr[i];
            }
        }
        for(int i=k+1;i<arr.length;i++){
            arr[i]=0;
        }
    }
    public static void printArray(int arr[]){
        for(int i : arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }
    void main(){
        int arr[] = {1,2,2,3,4,5,5,6,6,6,7};
        System.out.println(removeDuplicate(arr));
        removeDuplicate_Optimal(arr);
        printArray(arr);
    }
}
