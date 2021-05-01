package creaking_the_coding_interview.arrays_and_string;

public class StringCompression {

    public StringCompression(){

    }

    public String compression(String string){
        StringBuilder compressedString = new StringBuilder();
        int consecutiveCount =0;
        for(int i=0; i<string.length(); i++){
            consecutiveCount++;
            if(i + 1 >= string.length() || string.charAt(i) != string.charAt(i +1)){
                compressedString.append(string.charAt(i));
                compressedString.append(String.valueOf(consecutiveCount));
                consecutiveCount=0;
            }
        }
        return compressedString.length()<string.length()? compressedString.toString() : string;
    }
}
