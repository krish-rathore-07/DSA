package Array.Basics;

public class Largest_Element {

    //finding the largest element without making any other variable
    public static int findLargestWithoutMakingAnyVariable(int arr[]){
        for(int i :arr){
            if(arr[0]<i) arr[0]=i;
        }
        return arr[0];
    }

    public static void largest(int arr[]){
        int largest = arr[0];
        for(int i : arr){
            if(i>largest){
                largest=i;
            }
        }
        System.out.println("Largest Element is : " +largest);
    }

    public static void main(String args[]){
      int [] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
      largest(arr);
    }

}
