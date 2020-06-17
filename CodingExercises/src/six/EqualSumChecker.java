package six;

public class EqualSumChecker {
    public static boolean hasEqualSum(int numberOne, int numberTwo, int numberThree) {

        int sum = numberOne + numberTwo;

        if (sum == numberThree)
            return true;
        return false;
    }
}
