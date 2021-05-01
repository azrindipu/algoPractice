package creaking_the_coding_interview.arrays_and_string;

import java.util.HashSet;
import java.util.Set;

public class UnicChar {

    public UnicChar(){
    }

    public static boolean isStringHasUniqueChar(String string){
        if(string == null || string.isEmpty()){
            return false;
        }
        Set<Character> set = new HashSet<>();
        for(int i=0; i<string.length(); i++){
            if(!set.add(string.charAt(i))){
                return true;
            }
        }
        return false;
    }
}
