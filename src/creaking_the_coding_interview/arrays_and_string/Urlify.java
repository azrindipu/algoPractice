package creaking_the_coding_interview.arrays_and_string;

public class Urlify {

    public Urlify(){

    }

    public static char[] urlify(char[] chars, int trueLength){
        int spaceCounter = 0, index = 0;
        if(chars == null || chars.length == 0){
            return null;
        }
        for(int i=0; i<trueLength; i++){
            if(chars[i] == ' '){
                spaceCounter++;
            }
        }
        index = trueLength+(spaceCounter*2);
        for(int i=trueLength-1; i>=0; i--){
            if(chars[i]==' '){
                chars[index-1]='0';
                chars[index-1]='2';
                chars[index-1]='%';
            }
            else{
                chars[index-1]=chars[i];
            }
        }
        return chars;
    }
}
