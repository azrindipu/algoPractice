package recursion;

public class Factorial {
    public int calculateFactorial(int value){
        if(value == 1){
            return 1;
        }
        return value * this.calculateFactorial(value -1);
    }
}
