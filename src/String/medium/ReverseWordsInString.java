package String.medium;

//Given an input string s, reverse the order of the words.
//A word is defined as a sequence of non-space characters. The words in s will be separated by at least one space.
//Return a string of the words in reverse order concatenated by a single space.
//Note that s may contain leading or trailing spaces or multiple spaces between two words. The returned string should only have a single space separating the words. Do not include any extra spaces.
//
//Example 1:
//
//Input: s = "the sky is blue"
//Output: "blue is sky the"
//Example 2:
//
//Input: s = "  hello world  "
//Output: "world hello"
//Explanation: Your reversed string should not contain leading or trailing spaces.
//Example 3:
//
//Input: s = "a good   example"
//Output: "example good a"
//Explanation: You need to reduce multiple spaces between two words to a single space in the reversed string.
//

import java.util.ArrayList;

public class ReverseWordsInString {

    public static String reverseStringWordsMySolution(String s){
        ArrayList<StringBuilder> list = new ArrayList<>();
        StringBuilder str = new StringBuilder("");
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i)!=' '){
                str.append(s.charAt(i));
            }
            else{
                if(str.length()>0)list.add(str);
                str=new StringBuilder("");
            }
        }
        if(str.length()>0)list.add(str);
        str=new StringBuilder("");
        for(int i = list.size()-1;i>=0;i--){
            str.append(list.get(i));
            if(i!=0)str.append(" ");
        }
        return str.toString();
    }

    
    // this solution only works on the string which don't have consicutive spaces between the middle of string like String s = "hello    world ";
    public static String reverseStringWordsOptimalSolution(String s){

                char[] arr = s.trim().toCharArray();

                // Reverse entire string
                reverse(arr, 0, arr.length - 1);

                int start = 0;

                for (int i = 0; i <= arr.length; i++) {

                    if (i == arr.length || arr[i] == ' ') {

                        reverse(arr, start, i - 1);
                        start = i + 1;
                    }
                }

                return new String(arr);
            }

    public static void reverse(char[] arr, int left, int right) {

        while (left < right) {

            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }

    public static String reverseStringWords(String s){

        // 1. \\s - space character
        // 2. + - more than one
        // 3. \\s+ more than one space character can occur in the middle still we consider it as one space and trim the string
        String[] words = s.trim().split("\\s+");

        StringBuilder result = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            result.append(words[i]);

            if (i > 0) {
                result.append(" ");
            }
        }

        return result.toString();
    }

    void main(){
        String s = "";
        System.out.println(reverseStringWords(s));
    }
}
