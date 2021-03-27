package recursion;

public class MainClass {
    public static void main(String[] args){
        Factorial factorial = new Factorial();
        System.out.println(factorial.calculateFactorial(4));

        SumOfConsicutiveNumbers sumOfConsicutiveNumbers = new SumOfConsicutiveNumbers();
        System.out.println(sumOfConsicutiveNumbers.calculateSum(100));
    }
}
