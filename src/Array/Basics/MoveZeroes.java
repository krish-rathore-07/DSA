package Array.Basics;


import java.util.ArrayList;

// Moving the Zeroes in the end of the Array
public class MoveZeroes {

    //brute force
    public static void moveZeroes(int arr[]){
        ArrayList<Integer> list = new ArrayList<>();
        for(int i : arr){
            if(i!=0)list.add(i);
        }
        int k = 0;
        while(k<list.size()){
            arr[k]=list.get(k);
            k++;
        }
        while(k<arr.length){
            arr[k]=0;
            k++;
        }
    }

    public static void moveZeroesOptimal(int arr[]){
        int j= -1;
        for(int i = 0 ;i<arr.length;i++){
            if(arr[i]==0){
                j=i;
                break;
            }

        }
        if(j==-1) return;

        for(int i= j+1;i<arr.length;i++){
            if(arr[i]!=0){
                int temp = arr[i];
                arr[i]= arr[j];
                arr[j] = temp;
                j++;
            }
        }
    }

    public static void printArr(int arr[]){
        for(int i : arr){
            System.out.print(i+ " ");
        }
        System.out.println();
    }

    public static void main(String args[]){
        int arr[ ] = {1,0,2,5,0,0,0,6,43,0};
        printArr(arr);
        moveZeroesOptimal(arr);
        printArr(arr);
    }
}
