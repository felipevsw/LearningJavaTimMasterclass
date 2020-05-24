public class Challenge {

    public static void main(String[] args) {

        double myFirstValue = 20.00d;
        double mySecondValue = 80.00d;

        double result = (myFirstValue + mySecondValue) * 100.00d;
        System.out.println("Result: " + result);
        double remainder = result % 40.00d;
        System.out.println("Remainder: "+ remainder);
        boolean remainderExists = (remainder != 0) ? true : false;

        System.out.println("Was there a remainder: " + remainderExists);

        if (remainderExists) {
            System.out.println("Got some remainder: " + remainder);
        }
    }
}
