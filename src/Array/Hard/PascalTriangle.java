package Array.Hard;


import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {

    //this function generates the specific element in the pascal's triangle
    public static int pascalElement(int row , int col){
        long ans = 1;
        for(int i = 0;i<col;i++){
            ans = ans * (row - i);
            ans = ans / (i+1);
        }
        return (int)ans;
    }

    // this function generates the entire row of pascals triangle
    public static List<Integer> pascalRow(int row){
        long ans = 1;
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        if(row==1)return list;
        for(int col =1 ;col <row ;col++){
            ans = ans * (row - col);
            ans = ans / col;
            list.add((int)ans);
        }
        return list;
    }

    //this function generates the entire pascals triangle
    public static List<List<Integer>> pascalTriangle(int row){
        List<List<Integer>> list = new ArrayList<>();
        for(int i = 1;i<=row;i++){
            list.add(pascalRow(i));
        }
        return list;
    }


    void main(){
        int row= 6;
        int col = 3;
        System.out.println(pascalRow(row));
//        System.out.println(pascalTriangle(row));
        System.out.println(pascalElement(row-1,col-1));
    }
}
