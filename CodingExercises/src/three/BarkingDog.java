package three;

public class BarkingDog {
    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if (hourOfDay < 0 || hourOfDay > 23) {
            return false;
        }
        if (!barking) {
            return false;
        }
        if (hourOfDay < 8 || hourOfDay > 22) {
                return true;
            }
        return false;
    }
}
    /*Alternative version
    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {

        if (hourOfDay < 0 || hourOfDay > 24)
            return false;
        if (hourOfDay < 8 || hourOfDay > 22)
            if (barking)
                return true;
        return false;
    }*/