package seven;

public class TeenNumberChecker {
    public static boolean hasTeen(int numberOne, int numberTwo, int numberThree) {

        if (numberOne > 12 && numberOne < 20)
            return true;
        else if (numberTwo > 12 && numberTwo < 20)
            return true;
        else if (numberThree > 12 && numberThree < 20)
            return true;
        return false;
    }

    public static boolean isTeen(int numberOne) {

        if (numberOne > 12 && numberOne < 20)
            return true;
        return false;
    }
}
