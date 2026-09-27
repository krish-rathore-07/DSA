package BinarySeach;

public class SearchIn2D_1 {


//    You are given an m x n integer matrix matrix with the following two properties:
//
//    Each row is sorted in non-decreasing order.
//    The first integer of each row is greater than the last integer of the previous row.
//    Given an integer target, return true if target is in matrix or false otherwise.
//
//    You must write a solution in O(log(m * n)) time complexity.


    // Solution :- first of all assume the matrix as a 1D array or flatten the matrix in 1D array then think according to search in that array;



    public static boolean searchIn2D(int arr[][],int target){
        int n = arr.length;
        int m= arr[0].length;
        int low = 0;
        int high = n*m-1;

        while(low <= high){
            int mid = low + (high-low)/2;
            int row  = mid/m;
            int col = mid%m;

            if(arr[row][col]==target)return true;

            else if(arr[row][col] < target) low = mid+1;

            else high = mid-1;
        }
        return false;
    }

    void main(){
        int arr[][] = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target = 31;
        System.out.println(searchIn2D(arr,target));
    }
}
