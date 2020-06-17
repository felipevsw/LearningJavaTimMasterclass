package five;

public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double numberOne, double numberTwo) {

        int castOne = (int)(numberOne * 1000);
        //System.out.println(castOne);
        int castTwo = (int)(numberTwo * 1000);
        //System.out.println(castTwo);

        if (castOne == castTwo)
            return true;
        return false;
    }
}
