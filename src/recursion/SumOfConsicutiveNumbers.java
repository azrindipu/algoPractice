package recursion;

public class SumOfConsicutiveNumbers {
    public int calculateSum(int value){
        if(value == 0){
            return 0;
        }
        return value + this.calculateSum(value -1);
    }
}
