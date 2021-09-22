package p1;

public class ParamConcatenator {

    public static void main(String[] args) {

        System.out.println(concatenateParams(4, 4.4, "Four"));

    }

    private static String concatenateParams(int integerValue, double doubleValue,
                                     String stringValue) {
        return stringValue + (integerValue + doubleValue);
    }
}
