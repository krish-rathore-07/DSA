package Array.Medium;


// Moving the zeroes in the end of the array

import java.util.ArrayList;

public class MovingZeroes {

    // Brute force for moving zeroes to the end
    public static void movingZeroesBrute(int arr[]){
        ArrayList<Integer> list = new ArrayList<>();
        int n = arr.length;
        int i=0;
        while(i<n){
            if(arr[i]!=0)list.add(arr[i]);
            i++;
        }
        i=0;
        while(i<list.size()){
            arr[i]=list.get(i);
            i++;
        }
        while(i<n)arr[i++]=0;
    }

    //Optimal approach to move zeroes in the end
    public static void movingZeroesOptimal(int arr[]){
        int j= -1 ;
        int n= arr.length;
        for(int i = 0 ;i<n;i++){
            if(arr[i]==0){
                j=i;
                break;
            }
        }
        if(j==-1)return;
        int i = j+1;
        while(i<n){
            if(arr[i]!=0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j]=temp;
                j++;

            }
            i++;
        }
    }

    //printing array
    public static void printArray(int arr[]){
        for(int i : arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }

    void main(){
        int arr[] = {1,2,0,8,7,0,0,0,7,5,34,0};
//        movingZeroesBrute(arr);
        movingZeroesOptimal(arr);
        printArray(arr);
    }
}
