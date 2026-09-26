package String.Basics;

public class ReverseWords {

    public static String reverseWords(String s){
        String arr[] = s.split("\\.");
        StringBuilder str = new StringBuilder("");

        for(int i = arr.length-1;i>=0;i--){
            str.append(arr[i]);
            if(i!=0) str.append('.');
        }
        return str.toString();
    }

    public static void main(String args[]){
        String s = "i.like.this.program.very.much";
        System.out.println();
        System.out.println(reverseWords(s));
    }
}
