package Array.Basics;


//In this program we are taking union of two sorted arrays


import java.util.ArrayList;

public class UnionOfSortedArray {

    public static ArrayList<Integer> unionOfArray(int arr1 [] , int arr2[]){
        int n = arr1.length;
        ArrayList<Integer> list = new ArrayList<>();
        int m = arr2.length;
        int i = 0;
        int j= 0;
        while(i<n && j<m){
            if(arr1[i]<arr2[j]){
                if(!list.isEmpty() || list.get(list.size()-1)!=arr1[i]) {
                    list.add(arr1[i]);
                }
                i++;
            }
            else{
                if(!list.isEmpty() || list.get(list.size()-1)!=arr2[j]){
                    list.add(arr2[j]);
                }
                j++;
            }
        }
        while(i<n){
            if(!list.isEmpty() ||list.get(list.size()-1)!=arr1[i]){
                list.add(arr1[i]);
            }
            i++;
        }
        while(j<m){
            if(!list.isEmpty() || list.get(list.size()-1)!=arr2[j]){
                list.add(arr2[j]);
            }
            j++;
        }
        return list;
    }

    void main(){
        int arr1[] = {1,2,3,3,4,5,6};
        int arr2[] = {1,2,2,3,3,4,5,7,8,9};
        System.out.println(unionOfArray(arr1,arr2));

    }
}
