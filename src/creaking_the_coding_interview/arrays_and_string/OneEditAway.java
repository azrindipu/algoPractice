package creaking_the_coding_interview.arrays_and_string;

public class OneEditAway {

    public OneEditAway(){

    }

    public boolean isOneEditAway(String string01, String string02){
        if(string01.length() == string02.length()){
            return this.oneReplace(string01, string02);
        }
        else if(string01.length() + 1 == string02.length()){
            return this.oneInsertOrRemove(string01, string02);
        }
        else if(string01.length() -1 == string02.length()){
            return this.oneInsertOrRemove(string02, string01);
        }
        return false;
    }

    private boolean oneReplace(String string01, String string02){
        boolean isOneDiffFound = false;
        for(int i=0; i<string01.length(); i++){
            if(string01.charAt(i) != string02.charAt(i)){
                if(isOneDiffFound){
                    return false;
                }
                isOneDiffFound = true;
            }
        }
        return true;
    }

    private boolean oneInsertOrRemove(String string01, String string02){
        int index01=0;
        int index02=0;
        while (index01<string01.length() && index02 < string02.length()){
            if(string01.charAt(index01) != string02.charAt(index02)){
                if(index01 != index02){
                    return false;
                }
                index02++;
            }
            else{
                index01++;
                index02++;
            }
        }
        return true;
    }
}
