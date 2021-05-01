package creaking_the_coding_interview.arrays_and_string;

import java.util.Arrays;

public class CheckPermutation {

    public CheckPermutation(){

    }

    public static boolean checkPermutation(String string1, String string2){
        if(string1 == null || string2 == null || string1.isEmpty() ||
                string2.isEmpty() || (string1.length() != string2.length())){
            return false;
        }
        Arrays.sort(string1.toCharArray());
        Arrays.sort(string2.toCharArray());
        for(int i=0; i<string1.length(); i++){
            if(string1.charAt(i) != string2.charAt(i)){
                return false;
            }
        }
        return true;
    }
}
