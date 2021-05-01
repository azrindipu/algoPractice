package creaking_the_coding_interview.arrays_and_string;

public class StringRotation {

    public StringRotation(){

    }

    public boolean isStringRotate(String string01, String string02){
        if(string01.length() == string02.length() && string01.length() >0){
            String string = new StringBuilder(string01).append(string01).toString();
            if(string.contains(string02)){
                return true;
            }
        }
        return false;
    }
}
